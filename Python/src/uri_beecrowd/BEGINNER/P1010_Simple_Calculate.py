total = 0
for i in range(2):
    code, amount, price = map(float, input().split())
    total += amount * price

print("VALOR A PAGAR: R$ %.2f" % total)
