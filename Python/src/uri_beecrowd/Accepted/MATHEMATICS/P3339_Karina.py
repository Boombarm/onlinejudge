# author : Teerapat Phokhonwong
# Problem: 3339 - Karina
# Link: https://www.beecrowd.com.br/judge/en/problems/view/3339
# Answer: Accepted
# Submission: 12/13/22, 2:13:22 PM
# Runtime: 0.314s
# Note: หาจำนวนรากที่ 2 จาก a ถึง b

import math

def CountSquares(a, b):
    return (math.floor(math.sqrt(b)) - math.ceil(math.sqrt(a)) + 1)

n = int(input())
for i in range(n):
    a, b = map(int, input().split())
    print(CountSquares(a, b))