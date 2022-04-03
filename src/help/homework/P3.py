n = int(input())
if n % 2 == 0:
    for i in range(1, n+1):
        print('#' * i)
else:
    for i in range(1, n+1):
        print('*' * i)
