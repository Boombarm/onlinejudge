N = int(input())

cost = 7
if N > 100:
    cost += (N - 100) * 5
    cost += 160 
elif N > 30:
    cost += (N - 30) * 2
    cost += 20  
elif N > 10:
    cost += (N - 10)

print(cost)