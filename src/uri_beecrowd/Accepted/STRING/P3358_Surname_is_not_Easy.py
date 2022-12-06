# author : Teerapat Phokhonwong
# Problem: 3358 - Surname is not Easy
# Link: https://www.beecrowd.com.br/judge/en/problems/view/3358
# Answer: Accepted
# Submission: 12/6/22, 4:53:55 AM
# Runtime: 0.127s
# Note: หาว่าถ้านามสกุลของนักเรียนมีพยัญชนะติดกันตั้งแต่ 3 ตัวขึ้นไป แปลว่านามสกุลนั้นอ่านยาก

import re

n = int(input())
for i in range(n):
    surname = input()
    chk = re.findall("([^aeiou|^AEIOU]{3,})", surname)
    if len(chk) > 0:
        print(f"{surname} nao eh facil")
    else:
        print(f"{surname} eh facil")