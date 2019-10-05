# Date: 03-09-2019
# author : Teerapat Phokhonwong
# Online judge: URI Online Judge
# Categories: PARADIGMS
# Problem: 1661 - Wine Trading in Gergovia
# Link: https://www.urionlinejudge.com.br/judge/en/problems/view/1661
# Timelimit: 1 sec
# Status: Accepted
# Submission: 9/3/19, 8:30:37 AM
# Runtime: 0.820s
# Solution:
# Note:


while True:
    n = int(input())
    if n == 0 : break

    h = list(map(int, input().split()))
    work = abs(h[0])
    for i in range(1,n):
        h[i]+= h[i-1]
        work += abs(h[i])

    print(work)