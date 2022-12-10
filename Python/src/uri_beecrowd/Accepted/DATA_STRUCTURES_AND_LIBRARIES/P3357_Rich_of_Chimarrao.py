# author : Teerapat Phokhonwong
# Problem: 3357 - Rich of Chimarrão
# Link: https://www.beecrowd.com.br/judge/en/problems/view/3357
# Answer: Accepted
# Submission: 12/10/22, 5:10:18 PM
# Runtime: 0.141s

import math 

N, L, Q = map(float , input().split())
names = list(input().split())
a = math.ceil( (L / Q) % N)
amount = L % Q
answer = f"%s %.1f" % (names[a-1], Q if amount == 0 else amount)
print(answer)