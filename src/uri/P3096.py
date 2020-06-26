# length result of factorial
# https://en.wikipedia.org/wiki/Factorial
for i in range(1,1001):
    # n = int(input())
    total = 1
    for x in range(i,1, -1):
        total *= x
    j = len(str(total))
    print(str(i),j, j-i)
