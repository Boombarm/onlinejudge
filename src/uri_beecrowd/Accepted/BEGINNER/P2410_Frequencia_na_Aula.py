# Problem: 2410 - Frequencia na Aula
# Link: https://www.urionlinejudge.com.br/judge/en/problems/view/2410
# Answer: Accepted
# Submission: 4/3/20, 11:45:10 AM
# Runtime: 0.352s

n = int(input())
student = set()
for i in range(n):
    x = int(input())
    if x not in student:
        student.add(x)

print(len(student))