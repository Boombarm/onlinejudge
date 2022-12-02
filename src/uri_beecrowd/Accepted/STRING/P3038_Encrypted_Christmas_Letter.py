# Date: 04-02-2020
# author : Teerapat Phokhonwong
# Online judge: URI Online Judge
# Categories: STRING
# Problem: 3038 - Encrypted Christmas Letter
# Link: https://www.urionlinejudge.com.br/judge/en/problems/view/3038
# TimeLimit: 1 sec
# Status: Accepted
# Submission: 1/11/20, 3:27:02 PM
# Language: Python3
# Runtime: 0.020s
# Solution:
# Note:

import sys


def decrypt(c):
    if c == '@':
        return 'a'
    elif c == '&':
        return 'e'
    elif c == '!':
        return 'i'
    elif c == '*':
        return 'o'
    elif c == '#':
        return 'u'
    else:
        return c


if __name__ == '__main__':
    for line in sys.stdin:
        for x in line:
            print(decrypt(x), end='')
    print()
