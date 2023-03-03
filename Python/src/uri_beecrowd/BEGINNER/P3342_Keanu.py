import math

n = int(input())
middle = math.ceil((n ** 2) / 2)
if n % 2 == 0:
    print('%s casas brancas e %s casas pretas' % (middle, middle))
else:
    print('%s casas brancas e %s casas pretas' % (middle, middle - 1))