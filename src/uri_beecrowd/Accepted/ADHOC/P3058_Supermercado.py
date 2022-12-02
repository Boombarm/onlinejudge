# Problem: 3058 - Supermercado
# Link: https://www.urionlinejudge.com.br/judge/en/problems/view/3058
# Answer: Accepted
# Submission: 6/18/20, 2:07:46 AM
# Runtime: 0.020s
# note: find max profit
n = int(input())
lowest = 0
tp, tg = 0, 0
for i in range(n):
    p, g = map(float, input().split())
    a = float(p / g)
    if lowest == 0:
        lowest = a
        tp = p
        tg = g
    elif lowest > a:
        lowest = a
        tp = p
        tg = g

total = tp + ((1000 - tg) * (tp / tg))
print("%.2f" % total)
