# Date: 02-04-2020
# author : Teerapat Phokhonwong
# Online judge: URI Online Judge
# Categories: Beginner
# Problem: 2951 - The Return of The King
# Link: https://www.urionlinejudge.com.br/judge/en/problems/view/2951
# Timelimit: 1 sec
# Status: Accepted
# Submission: 4/2/20, 5:29:08 PM
# Language: Python3
# Runtime: 0.012s
# Solution: dictionary
# Note:

n, g = map(int, input().split())
rune = {}
for i in range(n):
    r, v = map(str, input().split())
    rune[r] = int(v)

x = int(input())
recited = list(input().split())
value = 0
for x in recited:
    value += rune[x]

print(value)
if value < g:
    print('My precioooous')
else:
    print('You shall pass!')