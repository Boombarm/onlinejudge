# author : Teerapat Phokhonwong

if __name__ == '__main__':
    T = 1
    while True:
        N = int(input())
        if N == 0:
            break
        A = input()
        B = input()
        print("Teste %d" % T)
        for x in range(N):
            i, j = map(int, input().split())
            if (i + j) % 2 == 0:
                print(A)
            else:
                print(B)
        print()
        T += 1
