program nesting(input, output);

(*** Demonstrate nesting of procedures.  ***)

var
   i,j,k: integer;

(* ***************************    procA    ********************************** *)

procedure procA;

   var  i,j: integer;

   procedure procA2;
      var  i: integer;
   start
      writeln('in procA2');
      i := 120;
      j := 121;
      writeln('i=', i, '  j=', j, '  k=', k);
   finish;

   procedure procA3;
      var  i,j: integer;
   start
      writeln('in procA3');
      i := 130;
      j := 131;
      k := 132;
      writeln('i=', i, '  j=', j, '  k=', k);
   finish;

start
   writeln('in procA');
   i := 10;
   j := 11;
   k := 12;
   writeln('i=', i, '  j=', j, '  k=', k);
   procA2;
   procA3;
finish;

(* ***************************    procB    ********************************** *)

procedure procB;

   var  i: integer;

start
   writeln('in procB');
   i := 20;
   j := 21;
   writeln('i=', i, '  j=', j, '  k=', k);
finish;

(* **************************    main      ********************************** *)

start
   writeln('in main');
   i := 1;
   j := 2;
   k := 3;
   writeln('i=', i, '  j=', j, '  k=', k);
   procA;
   procB;
finish.