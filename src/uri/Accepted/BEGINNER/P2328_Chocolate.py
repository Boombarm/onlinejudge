n = int(input())
num = map(int, input().split())
total = 0
for x in num:
    total += x-1

print(total)