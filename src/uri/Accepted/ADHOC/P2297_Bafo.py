T = 0
while True:
    R = int(input())
    if R == 0: break
    Aldo = Beto = 0
    for x in range(R):
        A, B = map(int, input().split())
        Aldo += A
        Beto += B
        
    T+=1
    print("Teste %d" % T)
    if Aldo > Beto:
        print("Aldo\n")
    else:
        print("Beto\n")
    