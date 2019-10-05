def getLonelyIndex(arr, lonelyNum):
    for x in range(N):
        if arr[x] == lonelyNum: 
            return x


N = int(input())
table = [[0 for i in range(N)] for i in range(N)]
s1 = [0] * N
s2 = [0] * N
for i in range(N):
    tmp = list(map(int, input().split()))
    for j in range(N):
        table[i][j] = tmp[j]
        s1[i] += tmp[j]
        s2[j] += tmp[j]
        
#find lonely number
lonely = 0
for i in range(N):
    c = 0
    for j in range(N):
        if s1[i] == s1[j]:
            c += 1
    if c == 1:
        lonely = s1[i]
        break


i = getLonelyIndex(s1, lonely)
j = getLonelyIndex(s2, lonely)

realNumber = 0
if i > 0 : realNumber =  s1[i-1]
elif i < N-1: realNumber = s1[i+1] 
 
print(table[i][j] + (realNumber - lonely) , table[i][j])
