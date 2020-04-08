# Date: 08-04-2020
# author : Teerapat Phokhonwong
# Online judge: URI Online Judge
# Categories: AD-HOC
# Problem: 2569 - The 7 x 1 Witch
# Link: https://www.urionlinejudge.com.br/judge/en/problems/view/2569
# Timelimit: 1 sec
# Status: Accepted
# Submission: 4/8/20, 1:49:09 PM
# Language: Python3
# Runtime: 0.028s
# Solution:
# Note:

import re

if __name__ == "__main__":
    input_ = input().replace(" ", "")
    input_ = input_.replace("7", "0")
    a, b = re.split('[\\+x]', input_)
    answer = 0
    if input_.find('+') != -1:
        answer = int(a) + int(b)
        answer = str(answer).replace('7', '0')
    else:
        answer = int(a) * int(b)
        answer = str(answer).replace('7', '0')

    print(int(answer))
