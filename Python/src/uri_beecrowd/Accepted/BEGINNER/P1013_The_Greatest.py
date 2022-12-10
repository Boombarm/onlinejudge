a, b, c = map(int, input().split())
tmp = (a + b + abs(a - b)) / 2
tmp = (tmp + c + abs(tmp - c)) / 2
print("%d eh o maior" % tmp)
