# @author Teerapat Phokhonwong
# @Onlinejudge: URI Online Judge
# @Problem: 2342 - Overflow
# @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/2342
# @Timelimit: 1 sec
# @Status: Accepted
# @Submission: 9/3/19, 9:31:13 AM
# @Runtime: 0.032s
# @Solution:
# @Note:

N = int(input())
P, Operator, Q = map(str,input().split())
P = int(P)
Q = int(Q)
if (Operator == '+' and P + Q <= N) or (Operator == '*' and P * Q <= N):
    print("OK")
else:
    print("OVERFLOW")
