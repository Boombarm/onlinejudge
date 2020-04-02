# Problem: 1213 - Ones
# Link: https://www.urionlinejudge.com.br/judge/en/problems/view/1213
# Answer: Accepted
# Submission: 4/2/20, 9:58:29 AM
# Runtime: 0.644s

import sys

while True:
    input_ = sys.stdin.readline()
    if input_ == "": break
    n = int(input_)

    counter = 2
    remain = 10 % n
    value = remain + 1
    tmp = remain

    while value % n != 0:
        tmp = (remain * tmp) % n
        value += tmp
        counter += 1

    print(counter)
