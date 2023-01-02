# author : Teerapat Phokhonwong
# Problem: 3300 - Recharged Unlucky Numbers
# Link: https://www.beecrowd.com.br/judge/en/problems/view/3300
# Answer: Accepted
# Submission: 12/7/22, 12:34:53 PM
# Runtime: 0.132s
# Note: หาว่ามีเลข 13 อยู่หรือไม่

import re

input_number = input()
chk = re.findall("13", input_number)
if chk:
    print(f"{input_number} es de Mala Suerte")
else:
    print(f"{input_number} NO es de Mala Suerte")