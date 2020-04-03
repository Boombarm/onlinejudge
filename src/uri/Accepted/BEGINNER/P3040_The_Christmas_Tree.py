# Date: 02-04-2020
# author : Teerapat Phokhonwong
# Online judge: URI Online Judge
# Categories: BEGINNER
# Problem: 3040 - The Christmas Tree
# Link: https://www.urionlinejudge.com.br/judge/en/problems/view/3040
# Timelimit: 1 sec
# Status: Accepted
# Submission: 4/2/20, 10:39:08 PM
# Language: Python3
# Solution:
# Note:

n = int(input())
for x in range(n):
    h, d, g = map(int, input().split())
    if 200 <= h <= 300 and d >= 50 and g >= 150:
        print('Sim')
    else:
        print('Nao')
