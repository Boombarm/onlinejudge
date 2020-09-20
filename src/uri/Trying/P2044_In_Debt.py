# Date: 20-09-2020
# author : Teerapat Phokhonwong
# Online judge: URI Online Judge
# Categories: MATHEMATICS
# Problem: 2044 - In Debt
# Link: https://www.urionlinejudge.com.br/judge/en/problems/view/2044
# TimeLimit: 1 sec
# Status: Accepted
# Submission: 9/20/20, 11:32:36 PM
# Language: Python3
# Runtime: 0.000s
# Solution: counting on sum multiply by 100
# Note:
if __name__ == '__main__':
    while True:
        n = int(input())
        if n == -1:
            break
        m = list(map(int, input().split()))
        temp = 0
        total = 0
        for x in m:
            temp += x
            if temp % 100 == 0:
                total += 1
                temp = 0
        print(total)
