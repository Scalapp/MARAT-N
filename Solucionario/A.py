import sys
from collections import Counter


sys.setrecursionlimit(10**5)
def pyint(): return int(input())
def pylist(): return list(map(int, input().split()))
def pyline(): return map(int, input().split())


def convert_to_base(n, base):
    if n == 0:
        return '0'

    d = "0123456789ABCDEF"
    r = ''
    while n > 0:
        ans = n % base
        r = d[ans] + r
        n //= base

    return r

def solve():
    while True:
        i = ""
        bactual, btocon, number = 0,0,0
        try:
            i = input()
            if not i or i == None or i == "":
                break
            bactual, btocon, number = i.split()
        except Exception as e:
            break

        bactual = int(bactual)
        btocon = int(btocon)

        new = 0
        try:
            new = int(number, bactual)
        except Exception as e:
            print(f"{number} is an illegal base {bactual} number")
            continue

        cnew = convert_to_base(new, btocon)
        print(f"{number} base {bactual} = {cnew} base {btocon}")

solve()