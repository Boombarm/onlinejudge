# Date: 04-02-2020
# author : Teerapat Phokhonwong
# Online judge: URI Online Judge
# Categories: STRING
# Problem: 2880 - Enigma
# Link: https://www.urionlinejudge.com.br/judge/en/problems/view/2880
# TimeLimit: 1 sec
# Status: Accepted
# Submission: 2/4/20, 4:03:06 PM
# Language: Python3
# Runtime: 0.788s
# Solution: หาจำนวนครั้งที่เจอไม่ตรงกันทุกคำ
# Note:

a = str(input())
b = str(input())
total = 0
for c in range(0, (len(a) - len(b))+1):
    failed = 0
    for d in range(0, len(b)):
        if a[d + c] == b[d]:
            failed = 1
            break
    if failed == 0:
        total += 1

print(total)
