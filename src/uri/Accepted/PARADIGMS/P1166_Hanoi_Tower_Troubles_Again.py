import math

def solv(n):
	T=0
	C=1
	counter = 1
	sum =0
	while counter < n:
		if T == 2:
			C += 2
			T=0
		T+=1
		sum += C
		counter +=1
	return math.pow(n,2) - sum

n = int(input())
counter = 1
while counter <= n:
	number = int(input())
	print("%d" % solv(number))
	counter +=1
