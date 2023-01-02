# author : Teerapat Phokhonwong
# Online judge: URI Online Judge
# Categories: Practice(Beginner)
# Problem: TLG - The Lead Game
# Link: https://www.codechef.com/problems/TLG
# Timelimit: 1 sec
# Status: Accepted
# Submission: 2018-03-16 19:14:07
# MEM: 27.1M
# Language: Python3
# Runtime: 0.03
# Solution:
# Note:


n = int(input())
p_win = maxLead = p1 = p2 = 0
for i in range(1, n):
    a, b = map(int, input().split())
    p1 = p1 + a
    p2 = p2 + b
    if p1 > p2 and p1 - p2 > maxLead:
        p_win = 1
        maxLead = p1 - p2
    elif p2 > p1 and p2 - p1 > maxLead:
        p_win = 2
        maxLead = p2 - p1

print(p_win, maxLead)
