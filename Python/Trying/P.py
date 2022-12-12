times = int(input())
universities = map(int, input().split())
answer = 0
for v in universities: 
    answer += v - (v % 3)
print(answer)