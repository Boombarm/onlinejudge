# author : Teerapat Phokhonwong
# Online judge: URI Online Judge
# Categories: MATHEMATICS
# Problem: 1624 - Promotion
# Link: https://www.beecrowd.com.br/judge/en/problems/view/1624
# Timelimit: 1 sec
# Status: Accepted
# Submission: 3/3/23, 7:33:56 PM
# Language: Python3
# Runtime: 0.045s
# Solution: 0/1 Knapsack
# Note: classic 0/1 Knapsack


# top-down
def knapsack_01_solv(p, w, b):
    n = len(p)
    memo = [[0 for j in range(b+1)] for i in range(n+1)]
    return solv(p, w, n, b, memo)

def solv(p, w, i, j, memo):
    if i == 0 or j == 0:
        # i = 0 ไม่มีของให้พิจารณา
        # j = 0 ถุุงเต็ม
        return 0
    
    if memo[i][j] > 0: # ถ้ามีข้อมูลอยู่แล้ว
        return memo[i][j]
    
    if j < w[i-1]: # เลือกไม่ได้ เกินความจุ
        memo[i][j] = solv(p, w, i-1, j, memo)
    else:
        memo[i][j] = max( solv(p, w, i-1, j, memo),
                     p[i-1] + solv(p, w, i-1, j-w[i-1], memo)
            )
    return memo[i][j]
    
    
while True:
    n = int(input())
    if n == 0:
        break
    
    price = []
    weight = []
    for i in range(n):
        p, w = map(int, input().split())
        price.append(p)
        weight.append(w)
    
    bag = int(input())
    answer = knapsack_01_solv(price, weight, bag)
    print(answer)