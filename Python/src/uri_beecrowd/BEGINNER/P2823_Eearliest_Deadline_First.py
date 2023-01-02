count = 0
n = int(input())
for i in range(n):
    c, p = map(float, input().split())
    count += c / p

print('FAIL' if count > 1 else 'OK')
