f1, f2 = map(float, input().split())
gdp_fluctuation = ((((1.0 + f1 / 100.00) * (1.0 + f2 / 100.00)) - 1.0) * 100.0)
print('%.6f' % gdp_fluctuation)