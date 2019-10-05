N = int(input())
answer = 0
for i in range(N):
    L,C = map(int , input().split())
    if L > C : answer += C 

print(answer)