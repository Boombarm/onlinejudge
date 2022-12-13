# author : Teerapat Phokhonwong
# Problem: 3106 - Coding Competition
# Link: https://www.beecrowd.com.br/judge/en/problems/view/3106
# Answer: Accepted
# Submission: 12/12/22, 5:47:31 PM
# Runtime: 0.057s

times = int(input())
universities = map(int, input().split())
answer = 0
for v in universities: 
    answer += v - (v % 3)
print(answer)