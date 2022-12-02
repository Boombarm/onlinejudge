# Date: 31-08-2019
# author : Teerapat Phokhonwong
# Online judge: URI Online Judge
# Categories: MATHEMATICS
# Problem: 1219 - Colourful Flowers
# Link: https://www.urionlinejudge.com.br/judge/en/problems/view/1219
# Timelimit: 1 sec
# Status: Accepted
# Submission: 8/31/19, 1:30:01 PM
# Language: Python3
# Runtime: 0.072s
# Solution:
# Note:


import sys
import math

pi = 3.1415926535897

#main
while True:

    input_ = sys.stdin.readline()
    if (input_ == ""): break

    a,b,c = map(int, input_.split())

    p = (a + b + c) / 2  # triangle perimeter
    R1 = (a*b*c) / math.sqrt((a + b + c) * (b + c - a) * (c + a - b) * (a + b - c))
    sunflower_area = pi * (R1 * R1)
    violet_area = math.sqrt(p * (p-a) * (p-b) * (p-c))
    R2 =  violet_area/p
    rose_area = pi * (R2*R2)

    print('%.4f' % (sunflower_area - violet_area),'%.4f' % (violet_area - rose_area),'%.4f' % rose_area)
