# author : Teerapat Phokhonwong
if __name__ == '__main__':
    T = 1
    while True:
        N = int(input())
        if N == 0: break

        ticket = list(map(int, input().split()))

        print("Teste %d" % T)
        for i in range(1, N + 1):
            if ticket[i - 1] == i:
                print(ticket[i - 1])
                break
        print()
        T += 1
