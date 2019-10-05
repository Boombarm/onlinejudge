A,B,C = map(int , input().split())
X,Y,Z = map(int , input().split())

if A > X or B > Y or C > Z :
    print("0")
else:
    answer = int(X / A) * int(Y / B) * int(Z / C)
    print(answer)

