# Problem: 2427 - Chocolate
# Link: https://www.urionlinejudge.com.br/judge/en/problems/view/2427
# Answer: Accepted
# Submission: 8/15/21, 9:36:15 PM
# Runtime: 0.056s

import math

L = int(input())
c = 0
while L >= 2:
    L /= 2
    c += 1
answer = int(math.pow(4, c))
print(answer)
