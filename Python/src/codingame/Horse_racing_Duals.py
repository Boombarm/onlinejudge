import math

arr = []
n = int(input())
for i in range(n):
    pi = int(input())
    arr.append(pi)

arr.sort(reverse=True)
answer = math.inf
i = 0
while i < n-1:
    answer = min(answer, arr[i] - arr[i+1])
    i+=1

print(answer)
