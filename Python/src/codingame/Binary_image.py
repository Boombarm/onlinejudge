p = ['.', 'O']
h = int(input())
row_sum = None
output = []
for i in range(h):
    row = list(map(int , input().split()))
    c = 1
    if row_sum == None:
        row_sum = sum(row)
    elif row_sum != sum(row):
        print('INVALID')
        exit()


    for j in row:
        temp = ''.ljust( j, p[0 if c % 2 == 1 else 1])
        output.append(temp)
        c += 1
    output.append('\n')


for i in output:
    print(i, end='')