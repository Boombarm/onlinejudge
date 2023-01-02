from math import sqrt,floor

c = int(input())
for t in range(c):
    n = int(input())
    print(n - floor(sqrt(n)))