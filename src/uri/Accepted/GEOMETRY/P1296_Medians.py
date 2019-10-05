# Date: 04-09-2019
# author : Teerapat Phokhonwong
# Online judge: URI Online Judge
# Categories: COMPUTATIONAL GEOMETRY
# Problem: 1296 - Medians
# Link: https://www.urionlinejudge.com.br/judge/en/problems/view/1296
# Timelimit: 1 sec
# Status: Accepted
# Submission: 9/4/19, 10:11:41 AM
# Language: Python3
# Runtime: 0.024s
# Solution:
# Note:

import sys
import math

while True:
    input_ = sys.stdin.readline()
    if input_ == '': break

    a,b,c = map(float, input_.split())
    s = (a + b + c) / 2.0
    d = s * (s - a) * (s - b) * (s - c)

    if d > 0:
        print("%.3lf" % float((4.0/3.0) * math.sqrt(s*(s - a)*(s - b)*(s - c))))
    else:
        print("-1.000")