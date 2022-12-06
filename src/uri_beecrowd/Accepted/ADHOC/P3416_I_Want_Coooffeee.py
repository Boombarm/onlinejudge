# author : Teerapat Phokhonwong
# Problem: 3416 - I Want Coooffeee
# Link: https://www.beecrowd.com.br/judge/en/problems/view/3416
# Answer: Accepted
# Submission: 12/1/22, 12:41:35 PM
# Runtime: 0.010s

import math

students, total_litres, student_drinks_millilitres = map(int , input().split(" "))
total = students * student_drinks_millilitres
answer = math.ceil(total / (total_litres * 1000)) * total_litres
print(answer)
