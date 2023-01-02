# Date: 03-09-2019
# author : Teerapat Phokhonwong
# Online judge: URI Online Judge
# Categories: MATHEMATICS
# Problem: 1371 - Close the Doors!
# Link: https://www.urionlinejudge.com.br/judge/en/problems/view/1371
# Timelimit: 1 sec
# Status: Accepted
# Submission: 9/3/19, 5:29:04 PM
# Language: Python3
# Runtime: 0.044s
# Solution:
# Note:


while True:
    n = int(input())
    if n == 0 : break

    s = 4
    m = 5
    print(1,end='')
    while s <= n:
        print(' %d' % s, end='')
        s+=m
        m+=2

    print()