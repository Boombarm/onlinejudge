if __name__ == '__main__':
    n = int(input())
    M = F = 0
    for x in range(0, n):
        name, sex = map(str, input().split(' '))
        if sex == 'M':
            M += 1
        else:
            F += 1
    print(M, 'carrinhos')
    print(F, 'bonecas')
