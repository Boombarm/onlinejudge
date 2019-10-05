# Date: 29-08-2019
# author : Teerapat Phokhonwong
# Online judge: URI Online Judge
# Categories: MATHEMATICS
# Problem: 1306 - Numbering Roads
# Link: https://www.urionlinejudge.com.br/judge/en/problems/view/1306
# Timelimit: 1 sec
# Status: Accepted
# Submission: 8/29/19, 5:16:32 PM
# Language: Python3
# Runtime: 0.160s
# Solution:
# Note:


count = 1
while True:
    R , N = map(int, input().split())


    if R == 0 and N == 0 : break
    elif R < N or R == N :
        print("Case "+str(count)+": 0")
    elif N * 2 > R:
        print("Case " + str(count) + ": 1")
    else:
        D = R-N

        if D % N == 0 : T = D / N
        else: T = (D / N) + 1

        if(int(T) > 26):
            print("Case "+str(count)+": impossible")
        else:
            print("Case "+str(count)+": "+str(int(T)))

    count+=1

