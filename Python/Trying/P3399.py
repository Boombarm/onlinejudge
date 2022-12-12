t1, t2, t3, n = map(int, input().split())

a = t2 - t1
b = t3 - t2
c = (b - a) * (n - 3)
answer = t3  + ((a + c) * (n - 3))
print(answer)