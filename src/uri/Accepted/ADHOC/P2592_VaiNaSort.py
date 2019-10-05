S = input()
while True:
    N = int(S)
    if N == 0: break
    i = 0
    while True:
        S = input()
        if len(S.split()) == 1 : break
        i+=1
    print(i)
        