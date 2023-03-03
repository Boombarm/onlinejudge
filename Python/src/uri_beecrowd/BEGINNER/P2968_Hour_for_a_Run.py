import math

V, N = map(int, input().split())
total = V * N
s = 10
for i in range(1, 10):
	ans = math.ceil(total * s / 100)
	if i > 1 : print(" ",end="")
	print(ans, end="")
	s += 10
print()