CV,CE,CS,FV,FE,FS = map(int, input().split())
C_score = (CV * 3) + CE
F_score = (FV * 3) + FE
if F_score > C_score :
    print("F")
elif C_score > F_score:
    print("C")
elif FS > CS :
    print("F")
elif CS > FS:
    print("C")
else:
    print("=")
