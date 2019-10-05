# Date: 02-09-2019
# author : Teerapat Phokhonwong
# Online judge: URI Online Judge
# Categories: GEOMETRY
# Problem: 2158 - Helping Uncle Cláudio
# Link: https://www.urionlinejudge.com.br/judge/en/problems/view/2158
# Timelimit: 1 sec
# Status: Accepted
# Submission: 9/2/19, 10:02:03 AM
# Runtime: 0.020s
# Solution:
# Note:

import sys

c = 0
while True:
    input_ = sys.stdin.readline()
    if (input_ == ""): break

    FP, FH = map(int , input_.split())
    c += 1
    print("Molecula #"+str(c)+".:.")
    print("Possui %d" % int((FP*1.5)+(FH*2)+2),"atomos e %d" % int(((FP*5)+(FH*6))/2),"ligacoes\n")


