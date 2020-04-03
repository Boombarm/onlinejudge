# Problem: 2950 - The Two Towers
# Link: https://www.urionlinejudge.com.br/judge/en/problems/view/2950
# Answer: Accepted
# Submission: 4/3/20, 9:45:28 AM
# Runtime: 0.016s

n, x, y = map(int, input().split())
answer = float(n / (x + y))
print('%.2f' % answer)
