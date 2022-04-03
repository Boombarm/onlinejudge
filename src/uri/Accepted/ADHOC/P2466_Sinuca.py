# Author: Teerapat Phokhonwong
# PROBLEM: 2466 - Sinuca
# LINK: https://www.urionlinejudge.com.br/judge/en/problems/view/2466
# RUNTIME: 0.052s
# SUBMISSION: 9/1/21, 12:46:04 AM
n = int(input())
arr = list(map(int, input().split()))
while n >= 2:
    top = []
    for i in range(1, n):
        x = arr[i] + arr[i - 1]
        if x == 0:  # B + W = W
            top.append(-1)
        elif x == 2:  # B + B = B
            top.append(1)
        elif x == -2:  # W + W = B
            top.append(1)
    arr = top
    n -= 1
print('preta' if arr[0] == 1 else 'branca')
