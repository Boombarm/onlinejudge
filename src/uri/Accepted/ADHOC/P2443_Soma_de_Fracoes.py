# PROBLEM: 2443 - Soma de Frações
# Author: Teerapat Phokhonwong
# RUNTIME: 0.128s
# SUBMISSION: 8/23/21, 4:50:44 PM
# note: GCD + LCM
def find_lcm(a, b):
    if a > b:
        greater = a
    else:
        greater = b

    while True:
        if greater % a == 0 and greater % b == 0:
            lcm = greater
            break
        greater += 1

    return lcm


def find_gcd(a, b):
    if b == 0:
        return a
    else:
        return find_gcd(b, a % b)


a, b, c, d = map(int, input().split())
lcm = find_lcm(b, d)
l1 = int(lcm / b)
l2 = int(lcm / d)
x = (a * l1) + (c * l2)
gcd = find_gcd(x, lcm)
print(int(x / gcd), int(lcm / gcd))
