Program PassOrFailSystem;

Var

ActualMark : Integer;

PossibleMark : Integer;

PercentageMark : Real;

Start { PassOrFailSystem }

Writeln ('Please type the student''s actual mark: ');
Readln (ActualMark);

Writeln ('Please type the total possible mark of the exam : ');
Readln (PossibleMark);

PercentageMark := (ActualMark / PossibleMark) * 100;

If (PercentageMark >= 50) Then
Start
Writeln;
Writeln ('Pass');
Finish
Else
Start
Writeln;
Writeln ('Fail');
Finish;
{ FinishIf }

Finish. { PassOrFailSystem }