# author : Teerapat Phokhonwong
# Problem: 3134 - Balanced Scale
# Link: https://www.beecrowd.com.br/judge/en/problems/view/3134
# Answer: Accepted
# Submission: 12/18/22, 12:23:51 PM
# Runtime: 0.015s

def solv(a, b, c, d):
    if a+b == c+d \
        or a+c == d+b \
        or a+d == b+c \
        or a == b+c+d \
        or b == c+d+a \
        or c == a+b+d \
        or d == a+b+c:
        return True
    return False


a = int(input().replace('.', ''))
b = int(input().replace('.', ''))
c = int(input().replace('.', ''))
d = int(input().replace('.', ''))
if solv(a, b, c, d):
    print("YES")
else:
    print("NO")
