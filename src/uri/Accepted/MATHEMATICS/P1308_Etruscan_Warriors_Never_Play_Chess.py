# Date: 03-09-2019
# author : Teerapat Phokhonwong
# Online judge: URI Online Judge
# Categories: MATHEMATICS
# Problem: 1308 - Etruscan Warriors Never Play Chess
# Link: https://www.urionlinejudge.com.br/judge/en/problems/view/1308
# Timelimit: 1 sec
# Status: Accepted
# Submission: 9/3/19, 9:19:39 PM
# Language: Python3
# Runtime: 0.340s
# Solution:
# Note:



import math

n = int(input())
for i in range(0,n):
    m = int(input())
    height = int((math.sqrt(1 + 8 * m) - 1) / 2)

    print(height)



# def find(n):
#     sum = 1
#     m = 2
#     i = 1
#     for k in range( 1, n+1 ):
#         if k == sum+m:
#             sum+=m
#             m+=1
#             i+=1
#     return i
#
# table = {}
# n = int(input())
# for i in range(0, n):
#     m = int(input())
#     if table.get(m) == None:
#         table[m] = find(m)
#     print(table[m])