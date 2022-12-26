# author : Teerapat Phokhonwong
# Problem: 3257 - Planting Trees
# Link: https://www.beecrowd.com.br/judge/en/problems/view/3257
# Answer: Accepted
# Submission: 12/26/22, 3:29:20 PM
# Runtime: 0.099s

def solv(t):
    a = []
    i = 1
    for c in t:
      a.append(c+i)
      i += 1
    return a

n=int(input())
t=list(map(int,input().split()))
t.sort(reverse=True)
a=solv(t)
print(max(a)+1)
