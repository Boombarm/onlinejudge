val = float(input())

n100 = val / 100
n50 = val % 100 / 50
n20 = val % 50 / 20
n10 = val % 100 % 50 % 20 / 10
n5 = val % 10 / 5
n2 = val % 5 / 2

m1 = val % 100 % 50 % 20 % 10 % 5 % 2 / 1
m2 = val % 1 / 0.5
m3 = val % 0.5 / 0.25
m4 = val % 100 % 50 % 20 % 10 % 5 % 2 % 1 % 0.5 % 0.25 / 0.1
m5 = val % 100 % 50 % 20 % 10 % 5 % 2 % 1 % 0.5 % 0.25 % 0.1 / 0.05
m6 = val % 100 % 50 % 20 % 10 % 5 % 2 % 1 % 0.5 % 0.25 % 0.1 % 0.05 / 0.01 + 0.01
print("NOTAS:")
print(int(n100), "nota(s) de R$ 100.00")
print(int(n50), "nota(s) de R$ 50.00")
print(int(n20), "nota(s) de R$ 20.00")
print(int(n10), "nota(s) de R$ 10.00")
print(int(n5), "nota(s) de R$ 5.00")
print(int(n2), "nota(s) de R$ 2.00")
print("MOEDAS:")
print(int(m1), "moeda(s) de R$ 1.00")
print(int(m2), "moeda(s) de R$ 0.50")
print(int(m3), "moeda(s) de R$ 0.25")
print(int(m4), "moeda(s) de R$ 0.10")
print(int(m5), "moeda(s) de R$ 0.05")
print(int(m6), "moeda(s) de R$ 0.01")
