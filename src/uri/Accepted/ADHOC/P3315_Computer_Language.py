max_tmp = 0
for i in range(4):
    x = sum([int(x) for x in input().split()])
    if max_tmp < x:
        max_tmp = x

print(max_tmp, '=', format(max_tmp, 'b'))
