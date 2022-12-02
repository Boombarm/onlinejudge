if __name__ == "__main__":
    N = int(input())
    print(N)
    coin = [0, 0, 0, 0, 0, 0, 0]
    while N > 0:
        if N >= 100:
            coin[0] += 1
            N -= 100
        elif N >= 50:
            coin[1] += 1
            N -= 50
        elif N >= 20:
            coin[2] += 1
            N -= 20
        elif N >= 10:
            coin[3] += 1
            N -= 10
        elif N >= 5:
            coin[4] += 1
            N -= 5
        elif N >= 2:
            coin[5] += 1
            N -= 2
        elif N >= 1:
            coin[6] += 1
            N -= 1
    print("%d nota(s) de R$ 100,00" % coin[0])
    print("%d nota(s) de R$ 50,00" % coin[1])
    print("%d nota(s) de R$ 20,00" % coin[2])
    print("%d nota(s) de R$ 10,00" % coin[3])
    print("%d nota(s) de R$ 5,00" % coin[4])
    print("%d nota(s) de R$ 2,00" % coin[5])
    print("%d nota(s) de R$ 1,00" % coin[6])
