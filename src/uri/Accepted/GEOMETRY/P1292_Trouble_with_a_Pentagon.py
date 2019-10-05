# Date: 04-09-2019
# author : Teerapat Phokhonwong
# Online judge: URI Online Judge
# Categories: COMPUTATIONAL GEOMETRY
# Problem: 1292 - Trouble with a Pentagon
# Link: https://www.urionlinejudge.com.br/judge/en/problems/view/1292
# Timelimit: 1 sec
# Status: Accepted
# Submission: 9/4/19, 9:44:12 AM
# Language: Python3
# Runtime: 0.092s
# Solution:
# Note:

import sys
import math

while True:
    input_ = sys.stdin.readline()
    if (input_ == ""): break

    F = float(input_)
    K = math.sin(108 * math.pi / 180) / math.sin(63 * math.pi / 180)
    print('%.10f'% float(F*K))