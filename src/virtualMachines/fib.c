#include <stdio.h>
#include <stdlib.h>

// Wildly inefficient Fibonacci function for comparing.
// To compile & run:
//
// > gcc -o fib fib.c
// > ./fib n
// or
// > time ./fib b
//

int fib(int n) {
  if (n < 2)
    return 1;
  else
    return fib(n - 1) + fib(n - 2);
}

int main(int argc, char *argv[])  {
  int n = atoi(argv[1]);
  int answer = fib(n);
  printf("Fib(%d) = %d\n", n, answer);
  return 0;
}
