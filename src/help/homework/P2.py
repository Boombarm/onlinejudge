import math

pi = 22 / 7
r = float(input())
h = float(input())
answer = "{:.2f}".format(pi * math.pow(r, 2) * h)
print(answer)
