# author : Teerapat Phokhonwong
# PROBLEM: 3307 - Decorate the Walk!
# Link: https://www.urionlinejudge.com.br/judge/en/problems/view/3307
# RUNTIME: 0.084s
# SUBMISSION: 9/1/21, 11:44:29 PM
# note: find radius from area of circle
import math

pi = 3.14
n = int(input())
for i in range(n):
    a = int(input())
    r = math.sqrt(a / (4 * pi))
    text = cal_rate = None
    if r < 12:  # red
        text = 'vermelho'
        cal_rate = 0.09
    elif 12 <= r <= 15:  # blue
        text = 'azul'
        cal_rate = 0.07
    else:  # yellow
        text = 'amarelo'
        cal_rate = 0.05
    print('{text} = R$ {cost:.2f}'.format(text=text, cost=a * cal_rate))
