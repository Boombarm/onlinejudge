# Date: 02-09-2019
# author : Teerapat Phokhonwong
# Online judge: URI Online Judge
# Categories: GEOMETRY
# Problem: 1124 - Elevator
# Link: https://www.urionlinejudge.com.br/judge/en/problems/view/1124
# Timelimit: 1 sec
# Status: Accepted
# Submission: 9/2/19, 9:41:10 AM
# Runtime: 0.088s
# Solution:
# Note:

import math

L= C= R1 = R2 = 0
while True:
    L, C , R1 , R2  = map(int, input().split())
    if L == 0 and C == 0 and R1 == 0 and R2 == 0 :
        break

    hip = math.hypot( R1 - ( L - R2 ),  R1 - ( C - R2 ))
    if hip >= R1 + R2 and R1 * 2 <= L and R1 * 2 <= C and R2 * 2 <= L and R2 * 2 <= C :
        print("S")
    else:
        print("N")
