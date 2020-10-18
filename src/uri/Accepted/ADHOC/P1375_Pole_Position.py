# author : Teerapat Phokhonwong

if __name__ == "__main__":
    while True:
        N = int(input())
        if N == 0:
            break
        pole = [0] * (N+1)
        chk = 1
        for i in range(1, N+1):
            C, P = map(int, input().split())
            if chk == 0:
                continue
            if 1 <= i+P <= N and pole[i + P] == 0:
                pole[i+P] = C
            else:
                chk = 0
        
        if chk == 1:
            for i in range(1, N+1):
                if i > 1:
                    print(" %d" % pole[i], end="")
                else:
                    print(pole[i], end="")
            print()
        else:
            print("-1")
