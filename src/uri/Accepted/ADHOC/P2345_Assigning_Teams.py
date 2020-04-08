# Date: 08-04-2020
# author : Teerapat Phokhonwong
# Online judge: URI Online Judge
# Categories: AD-HOC
# Problem: 2345 - Assigning Teams
# Link: https://www.urionlinejudge.com.br/judge/en/problems/view/2345
# Timelimit: 1 sec
# Status: Accepted
# Submission: 4/8/20, 12:16:22 PM
# Language: Python3
# Runtime: 0.024s
# Solution:
# Note:

if __name__ == "__main__":
    a, b, c, d = map(int, input().split())
    answer = abs((a + d) - (b + c))
    print(answer)
