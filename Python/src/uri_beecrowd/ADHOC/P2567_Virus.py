# -*- coding: utf-8 -*-
# Date: 21-02-2020
# author : Teerapat Phokhonwong
# Online judge: URI Online Judge
# Categories: AD-HOC
# Problem: 2567 - Virus
# Link: https://www.urionlinejudge.com.br/judge/en/problems/view/2567
# TimeLimit: 1 sec
# Status: Accepted
# Submission: 2/21/20, 10:11:57 AM
# Language: Python3
# Runtime: 0.024s
# Solution:
# Note:

from sys import stdin

while True:
    line = stdin.readline()
    if line == '':
        break
    elif not line[0].isdigit():
        continue

    n = int(line)
    numberList = list(map(int, stdin.readline().split()))
    numberList.sort()
    mid = int(n / 2)
    e = n - 1
    sum = 0
    for i in range(0, mid):
        sum += numberList[e - i] - numberList[i]

    print(sum)