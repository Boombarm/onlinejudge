# Date: 20-04-2020
# author : Teerapat Phokhonwong
# Online judge: URI Online Judge
# Categories: AD-HOC
# Problem: 2418 - Carnaval
# Link: https://www.urionlinejudge.com.br/judge/en/problems/view/2418
# Timelimit: 1 sec
# Status: Accepted
# Submission: 4/20/20, 3:01:38 PM
# Language: Python3
# Runtime: 0.040s
# Solution:
# Note: ผลรวมคะแนน ไม่รวมน้อยสุดและมากสุด
score = [float(x) for x in input().split()]
score.sort()
answer = score[1] + score[2] + score[3]
print("%.1f" % answer)
