declare add(input, output);

//** esse exemplo adiciona 2 arrays de int  **//

//** ANTES os loops "for" eram assim: for i := 1 to size do  **//
//** AGORA os loops "for" são assim: for (i := 1 to size) do  **//
//** Além da mudanças na declação de begin ... end para start ...finish **//

const
  size = 5;

type
  intarray = array [1..size] of integer;

var
   i: integer;
   a: intarray;

// ***************************    adder    ********************************** //

procedure adder(var a,b : intarray);
var
   i: integer;

start
  for (i := 1 to size) do
     b[i] := a[i] + b[i];
finish;

// **************************    main      ********************************** //

start
  for (i := 1 to size) do
     a[i] := i;

  writeln('The array before call to adder:');
  for (i := 1 to size) do
     write (a[i]);
  writeln;

  adder(a,a);

  writeln('The array after call to adder:');
  for (i := 1 to size) do
     write (a[i]);
  writeln;
finish.
