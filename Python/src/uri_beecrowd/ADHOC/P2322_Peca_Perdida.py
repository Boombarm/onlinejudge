N = int(input())
total = N * (N+1) / 2
S = 0 
num = list(map(int , input().split()))
for x in range(N-1):
    S += num[x]

answer = int(total - S)
print(answer)
