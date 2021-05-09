n = int(input())
for x in range(n):
    p = input()
    if p == "P=NP":
        print('skipped')
        continue
    a, b = map(int, p.split('+'))
    print(a + b)
