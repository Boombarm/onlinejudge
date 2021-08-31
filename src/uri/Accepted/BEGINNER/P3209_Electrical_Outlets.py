n = int(input())
for i in range(n):
    c = list(map(int, input().split()))
    K = c[0] * 2 - 1
    print(sum(c) - K)