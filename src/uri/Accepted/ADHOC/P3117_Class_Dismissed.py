# Author: Teerapat Phokhonwong
# PROBLEM: 3117 - Class Dismissed!
# Link: https://www.urionlinejudge.com.br/judge/en/problems/view/3117
# SUBMISSION: 9/1/21, 1:09:37 AM

n, k = map(int, input().split())
student = list(map(int, input().split()))
flag = 0
for i in student:
    if i > 0:
        n -= 1
        if n < k:
            flag = 1
            break
print('YES' if flag == 0 else 'NO')
