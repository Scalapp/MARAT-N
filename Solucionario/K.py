import math
from sys import stdout
wr= stdout.write
def findDigits(n):
    if n <0:
        return 0
    if n <=1:
        return 1
    x = (n * math.log10(n /math.e))+ math.log10(2*math.pi * n)/2
    return int(math.floor(x)+1)

t = int(input())

for i in range (0,t):
    num = int(input())
    wr(f'{findDigits(num)}')
    print()