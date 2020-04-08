# Date: 07-04-2020
# author : Teerapat Phokhonwong
# Online judge: URI Online Judge
# Categories: AD-HOC
# Problem: 2343 - Caçadores de Mitos
# Link: https://www.urionlinejudge.com.br/judge/en/problems/view/2343
# Timelimit: 1 sec
# Status: Accepted
# Submission: 4/7/20, 11:04:48 PM
# Runtime: 0.652s
# Solution:
# Note:

from collections import defaultdict

if __name__ == "__main__":
    n = int(input())
    memo = defaultdict(dict)
    chk = 0
    for i in range(n):
        x, y = map(int, input().split())
        if x in memo and y in memo[x]:
            chk = 1
            break
        else:
            memo[x][y] = 1

    if chk == 0:
        print(0)
    else:
        print(1)
