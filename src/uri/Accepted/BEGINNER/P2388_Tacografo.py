# Author: Teerapat Phokhonwong
# Online Judge: URI Online Judge
# Problem: 2388 - Tacógrafo
# Link: https://www.urionlinejudge.com.br/judge/en/problems/view/2388
# Time limit: 1 sec
# Status: Accepted
# Submission: 10/25/19, 5:34:01 PM
# Runtime: 0.044s
# Solution:
# Note:


n = int(input())
total = 0
while n > 0:
    t, v = map(int, input().split())
    total += (t * v)
    n -= 1

print(total)
