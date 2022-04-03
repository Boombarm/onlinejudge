# Date: 8/15/21
# author : Teerapat Phokhonwong
# Online judge: URI Online Judge
# Categories: ADHOC
# Problem:  3060 - Parcelamento Sem Juros
# Link: https://www.urionlinejudge.com.br/judge/en/problems/view/3060
# Timelimit: 1 sec
# Status: Accepted
# Submission: 8/15/21, 10:27:58 PM
# Language: Python3
# Runtime: 0.003s

V = int(input())
A = int(input())
x = int(V / A)
now = x * A
P = [x] * A
for index, x in enumerate(P):
    if now < V:
        P[index] += 1
        now += 1
# print answer
for x in P:
    print(x)
