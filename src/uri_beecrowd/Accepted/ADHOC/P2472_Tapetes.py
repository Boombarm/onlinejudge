# Date: 07-04-2020
# author : Teerapat Phokhonwong
# Online judge: URI Online Judge
# Categories: AD-HOC
# Problem: 2472 - Tapetes
# Link: https://www.urionlinejudge.com.br/judge/en/problems/view/2472
# Timelimit: 1 sec
# Status: Accepted
# Submission: 4/7/20, 11:29:31 PM
# Runtime: 0.024s
# Solution:
# Note:

l, n = map(int, input().split())
answer = (l - (n - 1)) * (l - (n - 1)) + (n - 1)
print(answer)
