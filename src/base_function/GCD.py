def gcd(a, b):
    if b == 0:
        return a
    else:
        return gcd(b, a % b)


x = gcd(120, 90)
print(x)
