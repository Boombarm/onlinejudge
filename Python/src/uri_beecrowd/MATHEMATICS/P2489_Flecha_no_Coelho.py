# author : Teerapat Phokhonwong
# Problem: 2489 - Flecha no Coelho
# Link: https://www.beecrowd.com.br/judge/en/problems/view/2489
# Answer: Accepted
# Submission: 12/13/22, 5:56:31 PM
# Runtime: 0.000s

import sys
import math

while True:
    st = sys.stdin.readline()
    if st == "":
        break
    a, d , r = map(float , st.split())
    t1 = r - 90
    t2 = math.pi / 180
    answer = a + math.tan(t1 * t2) * d
    print(f"{answer:.4f}")