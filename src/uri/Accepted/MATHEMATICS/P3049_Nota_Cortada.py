# Problem: 3049 - Nota cortada
# Link: https://www.urionlinejudge.com.br/judge/en/problems/view/3049
# Answer: Accepted
# Submission: 6/17/20, 7:41:13 PM
# Runtime: 0.032s

x1 = 11200  # 70 * 160
b = int(input())
t = int(input())
x2 = 0.5 * (b + t) * 70
if x2 > (x1 - x2):
    print(1)
elif x2 < (x1 - x2):
    print(2)
else:
    print(0)
