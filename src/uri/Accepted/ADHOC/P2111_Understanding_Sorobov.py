# Date: 20-04-2020
# author : Teerapat Phokhonwong
# Online judge: URI Online Judge
# Categories: Data Structures and Libraries
# Problem: 2111 - Understanding Sorobov
# Link: https://www.urionlinejudge.com.br/judge/en/problems/view/2111
# Timelimit: 1 sec
# Status: Accepted
# Submission: 4/20/20, 7:15:32 PM
# Language: Python3
# Runtime: 1.272s
# Solution:
# Note:


import sys

m_table = {
    0: '10-01111',
    1: '10-10111',
    2: '10-11011',
    3: '10-11101',
    4: '10-11110',
    5: '01-01111',
    6: '01-10111',
    7: '01-11011',
    8: '01-11101',
    9: '01-11110'
}
t = 0
while True:
    if t > 0:
        print()
    input_ = sys.stdin.readline()
    if input_ == '':
        break
    input_ = input_.replace('\n', '')

    num = list(input_)
    size = len(num)
    answer = []
    for x in num[::-1]:
        answer.append(list(m_table[int(x)]))

    for q in range(9 - size):
        answer.append(list(m_table[0]))

    # row
    for i in range(0, 8):
        # column
        for j in answer[::-1]:
            print(j[i], end='')
        print()

    t += 1
