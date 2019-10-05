if __name__ == "__main__":
    N,C = map(int, input().split())
    total = 0
    chk = 1
    for i in range(N):
        S,E = map(int, input().split())
        if chk == 0: 
            continue
        if E-S + total <= C:
            total += (E-S)
        else:
            chk = 0

    if chk == 1 : 
        print("N")
    else: 
        print("S")