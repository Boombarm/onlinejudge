# Problem: 214 - Soda Surpler
# Link: https://www.urionlinejudge.com.br/judge/en/problems/view/3214
# Answer: Accepted
# Submission: 8/10/21, 12:07:16 AM
# Runtime: 0.000s

E, F, C = map(int, input().split())
answer = 0
while E + F >= C:
    E += F
    F = (E % C)
    E = int(E / C)
    answer += E
print(answer)
