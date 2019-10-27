A = int(input())
N = int(input())
total = 0
while N > 0:
    F = int(input())
    if F * A >= 40000000:
        total += 1
    N -= 1

print(total)
