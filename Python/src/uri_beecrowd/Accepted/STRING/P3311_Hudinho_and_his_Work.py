# author : Teerapat Phokhonwong
# Problem: 3311 - Hudinho and his Work
# Link: https://www.beecrowd.com.br/judge/en/problems/view/3311
# Answer: Accepted
# Submission: 12/6/22, 5:18:55 AM
# Runtime: 0.003s
# Note: Sort แบบสนใจเพียงแค่พยัญชนะตัวแรก

from functools import cmp_to_key
def compare(o1, o2):
    return ord(o1[0]) - ord(o2[0])
  
n = int(input())
arr = []
for i in range(n):
    arr.append(input())
    
arr.sort(key=cmp_to_key(compare))
for name in arr:
    print(name)