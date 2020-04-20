# Date: 20-04-2020
# author : Teerapat Phokhonwong
# Online judge: URI Online Judge
# Categories: AD-HOC
# Problem: 2420 - Guerra por Território
# Link: https://www.urionlinejudge.com.br/judge/en/problems/view/2420
# Timelimit: 1 sec
# Status: Accepted
# Submission: 4/20/20, 12:48:56 PM
# Language: Python3
# Runtime: 0.136s
# Solution:
# Note:

if __name__ == "__main__":
    n = int(input())
    num = list(input().split())
    left = right = 0
    i = 0
    j = n
    while i < j:
        if left < right:
            left += int(num[i])
            i += 1
        else:
            j -= 1
            right += int(num[j])

    if left != right:
        print(i + 1)
    else:
        print(i)
