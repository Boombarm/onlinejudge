# author : Teerapat Phokhonwong
# PROBLEM: 2397 - Triângulos
# Link: https://www.beecrowd.com.br/judge/en/problems/view/2397
# RUNTIME: 0.191s
# SUBMISSION: 1/1/23, 3:58:21 PM

A, B, C = map(int, input().split())
if A + B > C and A + C > B and B + C > A:
    a = (B**2 + C**2 - A**2) / (2*B*C)
    b = (A**2 + C**2 - B**2) / (2*A*C)
    c = (A**2 + B**2 - C**2) / (2*A*B)
    
    if a > 0 and b > 0 and c > 0:
        print('a')
    elif a == 0 or b == 0 or c == 0:
        print('r')
    else:
        print('o')
else:
    print('n')