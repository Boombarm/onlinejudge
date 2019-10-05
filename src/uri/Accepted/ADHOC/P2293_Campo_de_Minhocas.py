N, M = map(int , input().split())
wormLineValue1 = [0] * M
wormLineValue2 = [0] * N
for i in range(N):
    wormLine = list(map(int , input().split()))
    for j in range(M):
        wormLineValue1[j] += wormLine[j]
        wormLineValue2[i] += wormLine[j]

maxValue = 0
for x in wormLineValue1:
    if maxValue < x:
        maxValue = x
for x in wormLineValue2:
    if maxValue < x:
        maxValue = x
        
print(maxValue)