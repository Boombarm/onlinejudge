N = int(input())
hobbits = humans = elves = dwarves = magicians = 0
#● A - For dwarves;
#● E - For elves;
#● H - For humans;
#● M - For magicians;
#● X - For hobbits;
for x in range(N):
    R = input().split()
    if R[1] == "A":
        dwarves += 1
    elif R[1] == "E":
        elves += 1
    elif  R[1] == "H":
        humans += 1
    elif R[1] == "M":
        magicians += 1
    elif R[1] == "X":
        hobbits += 1

print("%d Hobbit(s)" % hobbits)
print("%d Humano(s)" % humans)
print("%d Elfo(s)" % elves)
print("%d Anao(s)" % dwarves)
print("%d Mago(s)" % magicians)
