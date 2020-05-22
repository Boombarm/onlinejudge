# Problem: 3076 - History Exercise
# Link: https://www.urionlinejudge.com.br/judge/en/problems/view/3076
# Answer: Accepted
# Submission: 5/19/20, 3:20:18 PM
# Runtime: 0.024s
# File size: 183 Bytes

import math
import sys

while True:
    input_ = sys.stdin.readline()
    if input_ == '':
        break
    n = int(input_)
    answer = math.ceil(n / 100)
    print(answer)

