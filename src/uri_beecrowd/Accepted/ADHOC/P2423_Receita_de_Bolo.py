def minimum(A,B):
    if A < B : return int(A)
    return int(B)

A,B,C = map(int, input().split())
m = minimum(minimum(A/2, B/3), C/5)
print(m)