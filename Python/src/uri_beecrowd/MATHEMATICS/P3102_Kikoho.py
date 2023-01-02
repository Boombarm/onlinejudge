# author : Teerapat Phokhonwong
# Problem: 3102 - Kikoho
# Link: https://www.beecrowd.com.br/judge/en/problems/view/3102
# Answer: Accepted
# Submission: 12/13/22, 6:25:13 PM
# Runtime: 0.000s
# Note: หาพื้นที่สามเหลี่ยมจากจุด 3 จุด

n = int(input())
for i in range(n):
    x1, y1, x2, y2, x3, y3 = map(int, input().split())
    t1 = x1 * (y2 - y3)
    t2 = x2 * (y3 - y1)
    t3 = x3 * (y1 - y2)
    area = abs(t1 + t2 + t3) * 0.5
    print(f"{area:.3f}")

