# A wildly inefficient Fibonacci function for
# VM comparison.
#
import sys

def fib(n):
    if (n < 2):
        return 1
    else:
        return fib(n - 1) + fib(n - 2)

n = int(sys.argv[1])
print fib(n)
