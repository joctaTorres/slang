declare pointer(input,output);

(* types *)
type
  integerArray = array [1..10] of integer;

  cellPtr = ^cell;
  cell = record
     id: integer;
     info: integerArray;
     next: cellPtr
  finish;

(* vars *)
var
  list, newrec: cellPtr;
  mycount, classNum: integer;
  pointer1: ^integer;
  pointer2: ^integerArray;

(* main program *)
start
finish.