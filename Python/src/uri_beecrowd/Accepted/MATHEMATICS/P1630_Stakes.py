# author : Teerapat Phokhonwong
# Problem: 1630 - Stakes
# Link: https://www.beecrowd.com.br/judge/en/problems/view/1630
# Answer: Accepted
# Submission: 12/13/22, 5:33:05 PM
# Runtime: 0.000s

import sys
from math import gcd

while True : 
    str_in = sys.stdin.readline()
    if str_in == '':
        break

    a, b  = map(int, str_in.split()) 
    if a == b : 
        print(4)
    else : 
        FPB = gcd(a, b) 
        print((a // FPB) * 2 + (b // FPB) * 2)