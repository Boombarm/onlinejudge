# Date: 15-08-2019
# author : Teerapat Phokhonwong
# Online judge: URI Online Judge
# Categories: COMPUTATIONAL GEOMETRY
# Problem: 2518 - FNDI's Staircase
# Link: https://www.urionlinejudge.com.br/judge/en/problems/view/2518
# Timelimit: 1 sec
# Status: Accepted
# Submission: 8/15/19, 9:18:19 PM
# Language: Python3
# Runtime: 0.020s
# Solution: ((sqrt(C^2 + H^2) * L) * N) / 10000
# Note:


import sys
import math


N = H = C = L = 0

#main
while True:
    input_ = sys.stdin.readline()
    if (input_ == ""): break

    N = int(input_)

    input_ = sys.stdin.readline()
    H, C , L = map(int, input_.split())

    ans = math.sqrt( ((C * C) + (H * H)))
    ans *= L
    ans *= N
    ans /= 10000
    print("%.4f" % ans)
# End Main