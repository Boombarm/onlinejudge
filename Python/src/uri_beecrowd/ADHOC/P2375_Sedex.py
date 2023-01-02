# Author: Teerapat Phokhonwong
# Online Judge: URI Online Judge
# Problem: 2375 - Sedex
# Link: https://www.urionlinejudge.com.br/judge/en/problems/view/2375
# Time limit: 1 sec
# Status: Accepted
# Submission: 9/15/19, 5:34:05 PM
# Runtime: 0.032s
# Solution:
# Note:

N = int(input())
A, L, P = map(int, input().split())

if A < N or L < N or P < N:
    print("N")
else:
    print("S")
