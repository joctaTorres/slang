declare a1 (input,output);
    USES dayio;

    CONST 
        { Open positions in the schedule. }
        NotScheduled = '        ';

        { Max length of an employee name. }
        EmployeeMaxLen = 8;

        { Hours in a day. }
        FirstHour = 8;
        LastHour = 17;          { 5:00 PM in 24-hour time }
        PastLastHour = 18;      { One past, for while loops. }

        { How much room to allow for each day in the table. }
        TableDayWidth = 9;
    TYPE 
        { The employee name type. }
        EmployeeType = string[EmployeeMaxLen];

        { The type of the schedule ARRAY. }
        { HourType = FirstHour..LastHour; }
        HourType = 8..17;
        ScheduleType = ARRAY [HourType, DayType] OF EmployeeType;
        { HourScanType = FirstHour..PastLastHour; }
        HourScanType = 8..18;

    //**********************************************************************
     * Procedure to read the next non-blank.  It skips leading blanks, then
     * reads the string up to the first blank or eoln.
     **********************************************************************//
    PROCEDURE ReadString(VAR Str: string);
        VAR
            Ch: char;
        START
            Ch := ' ';
            WHILE (Ch = ' ') AND NOT eoln DO 
                read(Ch);

            IF Ch = ' ' THEN
                { There is no command on this line. }
                Str := ''
            ELSE
                START 
                    { Read the beast. }
                    Str := '';
                    WHILE (Ch <> ' ') AND NOT eoln DO
                        START
                            Str := Str + Ch;
                            read(Ch)
                        FINISH;

                    IF Ch <> ' ' THEN
                        { Command FINISHed at eoln. }
                        Str := Str + Ch
                FINISH
        FINISH; { ReadString }

    //**********************************************************************
     * Procedure to read the arguments held in common by the sched 
     * clear commands.  Returns them through the arguments.  If there
     * is some error, that is reported through the argument error.
     *  Precondition: Following the read pointer, the input contains
     *    two days of the week, then two integers.  If all days are present and
     *    correct, the integers must be present and correct.
     *  Postcondition: If both strings are recognized day names,
     *    they are read, and the integers are read as well, and their values
     *    are loaded into StartDay, FINISHDay, StartHour, and FINISHHour, and Error
     *    is set to false.  The hours are mapped to 24-hour clock time under
     *    the rule that hours less than 6 are PM, and others are AM.  If a day
     *    is missing or not recognized, the rest of the input line is
     *    discarded, and Error is set to true.  If there is extra information
     *    on the line, it is discared.  The read pointer is left at the start
     *    of the following line.
     **********************************************************************//
    PROCEDURE ReadSchedClrArgs(
            VAR StartDay, FINISHDay: DayType;      { Input days. }
            VAR StartHour, FINISHHour: HourType;   { Input hour range. }
            VAR Error: boolean);                { Input error indicator.}
        VAR
            InputHour: integer;                 { Input hour value. }

        { Map time to 24-hours based on the AM/PM rules. }
        FUNCTION MapTo24(Hour: integer): HourType;
            CONST
                { AM/PM time cut-off. }
                LastPM = 5;
            START
                IF Hour <= LastPM THEN
                    MapTo24 := Hour + 12
                ELSE
                    MapTo24 := Hour
            FINISH;

        START { ReadSchedClrArgs }
            { Read the days. }
            ReadDay(input, StartDay);
            ReadDay(input, FINISHDay);

            { See if they both worked. }
            IF (StartDay <> BadDay) AND (FINISHDay <> BadDay) THEN 
                START
                    { It worked.  Read the hours. }
                    read(InputHour);
                    StartHour := MapTo24(InputHour);
                    read(InputHour);
                    FINISHHour := MapTo24(InputHour);

                    { Report success }
                    Error := FALSE 
                FINISH
            ELSE
                // Something went wrong, seriously wrong. //
                Error := TRUE;

            // We're done with this line. //
            readln
        FINISH; { ReadSchedClrArgs }

    {****************************************************************
     * PROCEDURE to print headers of each day.
     *  Precondition: None.
     *  Postcondition: A header line with the days of the week has
     *    been printed.  The 
     ****************************************************************}
    PROCEDURE WriteDaysHeader;
        CONST

            { How many spaces to move over before printing days-of
              the week header. }
            DaysHeadMoveOver = 6;

            { How much room to assume is needed by each day string. }
            AllowForDay = 3;
        VAR
            Day: DayType;
        START
            write(' ': DaysHeadMoveOver);

            FOR (Day := Sun TO Sat) DO
                START
                    write('[ ');
                    WriteDay(output, Day);
                    write(' ]', ' ': TableDayWidth - AllowForDay - 4)
                FINISH;
            writeln
        FINISH; { WriteDaysHeader }

    {****************************************************************
     * Function that tells if a pFINISHing schedule is legal.
     * Its arguments are those of sched, excluding the employee name.
     *  Precondition: FirstHour and LastHour are in range.
     *  Postcondition: If the indicated area of the schedule contains
     *    blanks in each entry, then return true, else false.
     *  Note: Schedule is sent by VAR for efficiency -- it is not
     *    changed.
     ****************************************************************}
    FUNCTION SchedLegal(
            VAR Schedule: ScheduleType;     { Schedule to check. }
                StartDay, FINISHDay: DayType;  { Days in question. }
                FirstHour, LastHour:        { Hours in question. }
                        HourType): boolean;
        VAR
            ConflictFound: boolean;         { Tell if one found. }
            DayScan: DayType;               { Go through the days. }
            HourScan: HourScanType;         { Go through the hours. }
        START
            { Scan the days. }
            DayScan := StartDay;
            ConflictFound := FALSE;
            REPEAT
                { For this day, scan the times. }
                HourScan := FirstHour;
                WHILE NOT ConflictFound AND
                                (HourScan <= LastHour) DO START
                    { Conflict? }
                    ConflictFound :=
                            Schedule[HourScan, DayScan] <> NotScheduled;

                    { Next one. }
                    HourScan := HourScan + 1
                FINISH;

                { Next Day. }
                DayScan := succ(DayScan)
            UNTIL ConflictFound or (DayScan > FINISHDay);

            { And the answer is.. }
            SchedLegal := not ConflictFound
        FINISH; { SchedLegal }

    {****************************************************************
     * This takes care of most of the work of the clear and sched
     * commands.  Its arguments are those of sched, with blanks in
     * Employee for the clear.  It places this name in each indicated
     * postion.
     *  Precondition: FirstHour and LastHour are in range.
     *  Postcondition: The area of the schedule is changed to show
     *    the indicated employee.
     *  Note: This will replace any old entry, so the sched command
     *    should call SchedLegal above to make sure the operation
     *    is legal before calling this routine.
     ****************************************************************}
    PROCEDURE SetSchedPart(
            VAR Schedule: ScheduleType;     { Set me! Set me! }
                Employee: EmployeeType;     { Who gets to work. }
                StartDay, FINISHDay: DayType;  { Days in question. }
                FirstHour, LastHour:        { Hours in question. }
                                HourType);
        VAR
            DayScan: DayType;               { Go through the days. }
            HourScan: HourType;             { Go through the hours. }
        START
            for (DayScan := StartDay to FINISHDay) do
                for (HourScan := FirstHour to LastHour) do
                    Schedule[HourScan, DayScan] := Employee
        FINISH; { SetSchedPart }

    {****************************************************************
     * Perform the sched command.
     *  Precondition: The read pointer is followed by the arguments 
     *    for the sched command.
     *  Postcondition: The arguments have been read and echoed, and the
     *    read pointer is on the next line.  The sched command has been
     *    performed with appropriate messages.
     * Note: DayMap is passed by VAR for efficiency -- it is not
     *    changed.
     ****************************************************************}
    PROCEDURE DoSched(
            VAR Schedule: ScheduleType);    { Change this. }
        VAR
            Employee: EmployeeType;         { Input employee name. }
            StartDay, FINISHDay: DayType;      { Input days. }
            StartHour, FINISHHour: HourType;   { Input hour range. }
            Error: boolean;                 { Input error indicator.}
        START
            { Read the employee name }
            ReadString(Employee);

            { Read all the other arguments, and recieve error 
               indication. }
            ReadSchedClrArgs(StartDay, FINISHDay, StartHour, FINISHHour, Error);

            { For errors, let 'em know.  Otherwise, do it. }
            IF Error THEN
                writeln('*** Un-recognized day code.  ',
                    'Command not performed. ***')
            ELSE 
                { See if the scheduling is legal. }
                IF SchedLegal(Schedule, StartDay, FINISHDay,
                                        StartHour, FINISHHour) THEN
                    START
                        { Legal.  Do it and admit it. }
                        SetSchedPart(Schedule, Employee,
                                StartDay, FINISHDay, StartHour, FINISHHour);
                        writeln('>>> ', Employee, ' scheduled. <<<')
                    FINISH
                ELSE 
                    { Not legal. }
                    writeln('*** Conflicts with existing schedule.  ',
                        'Command not performed. ***')
        FINISH; { DoSched }

    {****************************************************************
     * Perform the clear command.
     *  Precondition: The read pointer is followed by the arguments 
     *    for the clear command.
     *  Postcondition: The arguments have been read and echoed, and the
     *    read pointer is on the next line.  The clear command has been
     *    performed with appropriate messages.
     * Note: DayMap is passed by VAR for efficiency -- it is not
     *    changed.
     ****************************************************************}
    PROCEDURE DoClear(
            VAR Schedule: ScheduleType);    { Change this. }
        VAR
            StartDay, FINISHDay: DayType;      { Input days. }
            StartHour, FINISHHour: HourType;   { Input hour range. }
            Error: boolean;                 { Input error indicator.}
        START
            { Read the arguments, and recieve error indication. }
            ReadSchedClrArgs(StartDay, FINISHDay, StartHour, FINISHHour, Error);

            { For errors, let 'em know.  Otherwise, do it. }
            IF Error THEN
                writeln('*** Un-recognized day code.  ',
                    'Command not performed. ***')
            ELSE 
                START
                    SetSchedPart(Schedule, NotScheduled, StartDay, FINISHDay,
                        StartHour, FINISHHour);
                    writeln('>>> Clear performed. <<<');
                FINISH { DoClear }
        FINISH;

    {****************************************************************
     * Peform the unsched command.
     *  Precondition: The read pointer is followed by an employee 
     *    name.
     *  Postcondition: The argument has been read and echoed, and the
     *    read pointer is on the next line.  The employee read has been
     *    removed from Schedule.
     ****************************************************************}
    PROCEDURE DoUnsched(
            VAR Schedule: ScheduleType);        { Remove from. }
        VAR
            Employee: EmployeeType;             { To remove. }
            Day: DayType;                       { Column scanner. }
            Hour: integer;                      { Row scanner. }
            Found: boolean;                     { Presence indicator }
        START
            { Read the employee. }
            readln(Employee);

            { Remove! Remove! }
            Found := FALSE;
            FOR (Day := Sun TO Sat) DO
                FOR (Hour := FirstHour TO LastHour) DO
                    IF Schedule[Hour, Day] = Employee THEN 
                        START
                            { Remove. }
                            Schedule[Hour, Day] := NotScheduled;

                            { Note. }
                            Found := TRUE 
                        FINISH;

            { Warn if not found. Else just state. }
            IF Found THEN 
                write('>>> ', Employee, ' removed from schedule. <<<')
            ELSE
                write('>>> ', Employee, 
                                    ' was not on the schedule. <<<')
        FINISH; { DoUnsched }

    {****************************************************************
     * Peform the print command.
     *  Precondition: None.
     *  Postcondition: Schedule has been printed to output.
     ****************************************************************}
    PROCEDURE DoPrint(
            VAR Schedule: ScheduleType);        { Print me. }
        VAR
            Hour: HourType;                     { Hour scan. }
            Day: DayType;                       { Day scan. }

        { Map from 24-hour time to 12-hour time.  Arguments less than
          13 are simply returned, arguments greater than 12 are 
          reduced by 12 and returned. }
        FUNCTION Map24to12(HourType: HourType): integer;
            START
                IF Hour < 13 THEN
                    Map24to12 := Hour
                ELSE
                    Map24to12 := Hour - 12
            FINISH;
        START
            readln;
            WriteDaysHeader;

            FOR (Hour := FirstHour TO LastHour) DO
                START
                    write(Map24to12(Hour):2, ':00 ');
                    FOR (Day := Sun TO Sat) DO
                        write(Schedule[Hour, Day], 
                            ' ': TableDayWidth - length(Schedule[Hour, Day]));
                    writeln
                FINISH
        FINISH;

    {****************************************************************
     * Peform the total command.
     *  Precondition: The read pointer is followed by an employee 
     *    name.
     *  Postcondition: The argument has been read and echoed, and the
     *    read pointer is on the next line.  The total scheduled hours
     *    for the employee read has been printed.
     ****************************************************************}
    PROCEDURE DoTotal(
            VAR Schedule: ScheduleType);        { The schedule. }
        VAR
            Employee: EmployeeType;             { To remove. }
            Day: DayType;                       { Column scanner. }
            Hour: integer;                      { Row scanner. }
            Total: integer;                     { Total intgers. }
        START
            { Read the employee. }
            readln(Employee);

            { Do the sum. }
            Total := 0;
            FOR (Day := Sun TO Sat) DO
                FOR (Hour := FirstHour TO LastHour) DO
                    IF Schedule[Hour, Day] = Employee THEN
                        Total := Total + 1;

            { Write the total. }
            writeln('>>> ', Employee,
                ' is scheduled for ', Total:1, ' hours. <<<<')
        FINISH; { DoTotal }

    {*****************************************************************
     * Main line.
     *****************************************************************}

    VAR
        { The schedule. }
        Schedule: ScheduleType;

        { Main loop continue flag. }
        KeepRunning: boolean;

        { Command input local to main. }
        Command: string;

    START
        { Clear the schedule. }
        SetSchedPart(Schedule, NotScheduled, Sun, Sat, FirstHour, LastHour);
 
        { Do the commands. }
        write('==> ');
        ReadString(Command);
        KeepRunning := TRUE;
        WHILE KeepRunning DO
            START
                IF Command = 'sched' THEN 
                    DoSched(Schedule)
                ELSE IF Command = 'clear' THEN
                    DoClear(Schedule)
                ELSE IF Command = 'unsched' THEN
                    DoUnsched(Schedule)
                ELSE IF Command = 'print' THEN
                    DoPrint(Schedule)
                ELSE IF Command = 'total' THEN
                    DoTotal(Schedule)
                ELSE IF Command = 'quit' THEN 
                    START
                        writeln;
                        writeln('>>> Program terminating. <<<');
                        KeepRunning := FALSE
                    FINISH
                ELSE
                    { Command not recognized. }
                    START
                        readln;
                        writeln;
                        writeln('*** Command ', Command, 
                                                    ' not recognized. ***');
                    FINISH;

                { Go to a new page for next'n. }
                write('==> ');
                ReadString(Command)
            FINISH
    FINISH.