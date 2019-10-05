def limit(V):
    if V > 100 : return 100
    if V < 0 : return 0
    return V

V,T = map(int, input().split())
P = list(map(int, input().split()))
for x in range(T):
    V = limit(V + P[x]) 

print(V)

