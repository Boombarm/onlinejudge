# Date: 02-09-2019
# author : Teerapat Phokhonwong
# Online judge: URI Online Judge
# Categories: COMPUTATIONAL GEOMETRY
# Problem: 1291 - Is This Integration?
# Link: https://www.urionlinejudge.com.br/judge/en/problems/view/1291
# Timelimit: 1 sec
# Status: Accepted
# Submission: 9/2/19, 11:07:45 AM
# Language: Python3
# Runtime: 0.260s
# Solution:
# Note:

import sys
import math

while True:
    input_ = sys.stdin.readline()
    if (input_ == ""): break

    a = float(input_)

    a3 = (-a) * a * (3 * (math.sqrt(3) - 4) + 2 * math.pi) / 3.0
    a2 = 4 * (a * a * (1 - math.pi / 4) - (a3) / 2)
    a1 = a * a - a2 - a3


    print("%.3lf %.3lf %.3lf" % (a1, a2, a3))