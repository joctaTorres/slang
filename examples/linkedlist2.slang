program linkedlist2(input,output);

(*  Example linked list Pascal Program                          *)
(*                                                              *)
(*  The file list.data would be used as the data file.          *)
(*  If there was an executable, a.out, run:  a.out < list.data  *)

const
  grades = 5;                             (* number of grades to be averaged *)
  avgPosition = 6;                        (* position of grade average *)
  size = 4;                               (* number of students *)

type
  integerArray = array [1..avgPosition] of integer;

  cellPtr = ^cell;
  cell = record
     id: integer;
     info: integerArray;
     next: cellPtr
  finish;

var
  list, newrec: cellPtr;
  count, classNum: integer;

(* ************************************************************************* *)
(* procedure insert                                                          *)
(* ************************************************************************* *)

procedure insert(var list: cellPtr; newrec: cellPtr);
var
  current: cellPtr;
  found: boolean;

start
    current := list;
    found := false;
    if (list = nil) then
      start
        newrec^.next := list;               (* fix bug so next is set to nil *)
        list := newrec;
      finish
    else if (newrec^.id < list^.id) then
      start
        newrec^.next := list;
        list := newrec;
      finish
    else
      start
        while (current <> nil) and (not found) do
          start
            if (current^.next = nil) then
              start
                newrec^.next := nil;        (* fix bug so next is set to nil *)
                current^.next := newrec;
                found := true;
              finish
            else if (newrec^.id < current^.next^.id) then
              start
                newrec^.next := current^.next;
                current^.next := newrec;
                found := true;
              finish;
            current := current^.next;
          finish;
      finish;
finish;

(* ************************************************************************* *)
(* function average                                                          *)
(* ************************************************************************* *)

function average(newrec: cellPtr): integer;
var
    i, sum : integer;

start
    sum := 0;
    for i := 1 to grades do
       sum:=sum + newrec^.info[i];
    average:=sum div grades;
finish;

(* ************************************************************************* *)
(* procedure makeNewrec                                                      *)
(* ************************************************************************* *)

procedure makeNewrec(var newrec : cellPtr);
var
    i: integer;

start
    new(newrec);
    read(newrec^.id);
    for i := 1 to grades do
       read(newrec^.info[i]);
    newrec^.info[avgPosition] := average(newrec);
finish;

(* ************************************************************************* *)
(* procedure displayInfo                                                     *)
(* ************************************************************************* *)

procedure displayInfo(var list : cellPtr);
var
  i: integer;
  current: cellPtr;

start
    current := list;
    if (list <> nil) then
    start
        write('            ');
        for i := 1 to grades do
           write('Grade     ');
        writeln;
        write('Student');
        for i := 1 to grades do
           write(i);
        writeln('        Average');
        for i := 1 to grades+2 do
           write('-----------');
        writeln;

        while (current <> nil) do
        start
          write(current^.id);
          for i := 1 to (grades + 1) do
            write(current^.info[i]);
          writeln;
          current:= current^.next;
        finish;
    finish;
finish;

(* ************************************************************************* *)
(* procedure cleanup                                                         *)
(* ************************************************************************* *)

procedure cleanup(var list : cellPtr);
var
  current: cellPtr;

start
   while (list <> nil) do
   start
      current := list;
      list := list^.next;
      current^.next := nil;
      dispose(current);
   finish;
   current := nil
finish;
(* ************************************************************************** *)
(* main program                                                               *)
(* ************************************************************************** *)

start
  read(classNum);
  list := nil;
  for count := 1 to size do
  start
    makeNewrec(newrec);
    insert(list, newrec);
  finish;
  writeln('Here are the class grades for class:', classNum); writeln;
  displayInfo(list);
  cleanup(list);
finish.