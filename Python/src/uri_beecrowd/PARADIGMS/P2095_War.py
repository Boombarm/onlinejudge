# author : Teerapat Phokhonwong
# Online judge: BEECROWDS
# Categories: PARADIGMS
# Problem: 2095 - War
# Link: https://judge.beecrowd.com/en/problems/view/2095
# Timelimit: 1 sec
# Status: Accepted
# Submission: 8/19/24, 12:45:14 PM
# Runtime: 0.238s
# Note: sort + greedy เรียงลำดับและทำการเลื่อน เพื่อเปรียบเทียบ 


s = int(input())
quadradonia = list(map(int, input().split()))
nlogonia = list(map(int, input().split()))
quadradonia.sort(reverse=True)
nlogonia.sort(reverse=True)

win = 0
j = 0
for i in range(s):
    if nlogonia[j] < quadradonia[i]:
        continue
    if quadradonia[i] < nlogonia[j]:
        win += 1
        j += 1
    
print(win)