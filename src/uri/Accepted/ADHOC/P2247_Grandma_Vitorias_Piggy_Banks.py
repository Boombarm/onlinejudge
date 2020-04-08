# Date: 08-04-2020
# author : Teerapat Phokhonwong
# Online judge: URI Online Judge
# Categories: AD-HOC
# Problem: 2247 - Grandma Vitória's Piggy Banks
# Link: https://www.urionlinejudge.com.br/judge/en/problems/view/2247
# Timelimit: 1 sec
# Status: Accepted
# Submission: 4/8/20, 11:56:29 AM
# Runtime: 0.036s
# Solution:
# Note:

if __name__ == "__main__":
    t = 0
    while True:
        n = int(input())
        if n == 0:
            break
        t += 1
        print('Teste', t)
        remain = 0
        for i in range(n):
            j, z = map(int, input().split())
            remain += (j - z)
            print(remain)
        print()
