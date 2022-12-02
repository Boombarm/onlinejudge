# Date: 08-04-2020
# author : Teerapat Phokhonwong
# Online judge: URI Online Judge
# Categories: MATHEMATICS
# Problem: 2227 - Airport
# Link: https://www.urionlinejudge.com.br/judge/en/problems/view/2227
# Timelimit: 1 sec
# Status: Accepted
# Submission: 4/8/20, 1:16:11 PM
# Language: Python3
# Runtime: 0.316s
# Solution:
# Note:

if __name__ == "__main__":
    t = 0
    while True:
        a, v = map(int, input().split())
        if a == v == 0:
            break
        t += 1
        print('Teste', t)
        airport = [0] * (a + 1)
        most_traffic = 0
        for i in range(v):
            x, y = map(int, input().split())
            airport[x] += 1
            airport[y] += 1
            if most_traffic < airport[x]:
                most_traffic = airport[x]
            if most_traffic < airport[y]:
                most_traffic = airport[y]

        isPrinted = 0
        for i in range(1, a + 1):
            if airport[i] == most_traffic:
                print(str(i) + ' ', end='')
        print('\n')
