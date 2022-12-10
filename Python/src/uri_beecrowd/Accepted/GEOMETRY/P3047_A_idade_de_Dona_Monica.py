# Date: 03-09-2019
# author : Teerapat Phokhonwong
# Online judge: URI Online Judge
# Categories: BEGINNER
# Problem: 3047 - A idade de Dona Mônica
# Link: https://www.urionlinejudge.com.br/judge/en/problems/view/3047
# Timelimit: 1 sec
# Status: Accepted
# Submission: 4/2/20, 2:22:40 PM
# Language: Python3
# Runtime: 0.020s
# Solution:
# Note:

def max(a, b):
    if a > b:
        return a
    return b


if __name__ == "__main__":
    m = int(input())
    a = int(input())
    b = int(input())
    c = m - (a + b)
    brother = max(max(a, b), c)

    print(brother)
