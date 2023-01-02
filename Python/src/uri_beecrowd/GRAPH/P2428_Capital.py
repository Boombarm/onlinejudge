# author : Teerapat Phokhonwong
# Problem: 2428 - Capital
# Link: https://www.beecrowd.com.br/judge/en/problems/view/2428
# Answer: Accepted
# Submission: 12/18/22, 11:01:11 AM
# Runtime: 0.276s

a, b, c, d = map(int, input().split())

if a / b == c / d \
or a / b == d / c \
or a / c == b / d \
or a / c == d / b \
or a / d == b / c \
or a / d == c / b:
    print('S')
else:
    print('N')
