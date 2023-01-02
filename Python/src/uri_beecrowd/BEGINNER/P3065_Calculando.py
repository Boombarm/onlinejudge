# -*- coding: utf-8 -*-
# Date: 05-02-2020
# author : Teerapat Phokhonwong
# Online judge: URI Online Judge
# Categories: STRING
# Problem: 3065 - Calculando
# Link: https://www.urionlinejudge.com.br/judge/en/problems/view/3065
# TimeLimit: 1 sec
# Status: Accepted
# Submission: 2/5/20, 9:43:16 AM
# Language: Python3
# Runtime: 0.828s
# Solution:
# Note:
import re

if __name__ == "__main__":
    c = 0
    while True:
        n = int(input())
        if n == 0:
            break
        c += 1
        x = input()

        numberList = re.split('[+-]', x)
        operList = []
        for j in x:
            if j == '+' or j == '-':
                operList.append(j)

        answer = int(numberList[0])
        for k in range(1, len(numberList)):
            if operList[k - 1] == '+':
                answer += int(numberList[k])
            else:
                answer -= int(numberList[k])

        print("Teste " + str(c))
        print(answer, end="\n\n")
