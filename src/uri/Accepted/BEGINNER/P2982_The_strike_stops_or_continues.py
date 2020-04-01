# Problem: 2982 - The strike stops or continues?
# Link: https://www.urionlinejudge.com.br/judge/en/problems/view/2982
# Answer: Accepted
# Submission: 3/26/20, 3:29:28 PM
# Runtime: 0.228s


n = int(input())
cut = 0
for x in range(n):
    c, v = map(str, input().split())
    if c == 'G':
        cut -= int(v)
    else:
        cut += int(v)

if cut >= 0:
    print('A greve vai parar.')
else:
    print('NAO VAI TER CORTE, VAI TER LUTA!')

