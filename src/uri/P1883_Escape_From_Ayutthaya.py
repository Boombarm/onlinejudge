# author : Teerapat Phokhonwong
# Onlinejudge: URI Online Judge
# Categories:
# Problem:
# Link:
# Timelimit: 1 sec
# Status: TLE
# Submission:
# Runtime: 
# Solution:
# Note:

N = M = 0
MAP = []
start = None
end = None
fire = None

#top -> bot -> right -> left
nY = [-1, 1, 0, 0]
nX = [0, 0, -1, 1]

class Point:
    x = y = t = 0
        
    def __init__(self,y, x, t=0):
        self.x = x
        self.y = y
        self.t = t
    
    def equals(self,p):
        return self.x == p.x and self.y == p.y 

    
def BFS(Q):
    while(len(Q) > 0):
        p = Q.pop(0)
        if p == None: 
            continue
    
        pX = p.x
        pY = p.y
        t = p.t
        MAP[pY][pX] = 1;
        dead = (abs(fire.x - pX) + abs(fire.y - pY))
        if dead == t : 
            continue
        
        if p.equals(end):
            return True

        for i in range(0, 4):
            pX = p.x + nX[i]
            pY = p.y + nY[i]
            if pX > 0 and pX < M and pY > 0 and pY < N :
                if MAP[pY][pX] == 0 :
                    nextPoint = Point(pY,pX,t+1)
                    Q.append(nextPoint)

    return False
    
    
#Main 
t = int(input())
while(t > 0):
    t = t-1
    N, M = map(int, input().split())
    MAP = []
    start = None
    end = None
    fire = None
    Q = []
    for y in range(0, N):
        MAP.append(list(input()))
        for x in range(len(MAP[y])):
            if MAP[y][x] == '.':
                MAP[y][x] = 0
            elif MAP[y][x] == '#':
                MAP[y][x] = 1
            elif MAP[y][x] == 'S':
                MAP[y][x] = 1
                start = Point(y,x)
            elif MAP[y][x] == 'E' :
                MAP[y][x] = 0
                end = Point(y,x);
            elif MAP[y][x] == 'F' :
                MAP[y][x] = 1
                fire = Point(y,x)
            else:
                MAP[y][j] = 0
    
    # for y in range(0, N):
    #     print(MAP[y])

    escape = (abs(start.x - start.x) + abs(start.y - start.y))
    dead = (abs(fire.x - end.x) + abs(fire.y - end.y))
    if escape >= dead :
        print("N")
        continue
    
    Q.append(start)
    answer = BFS(Q)
    # for y in range(0, N):
    #     print(MAP[y])
        
    if answer :
        print("Y")
    else:
        print("N")
#End Main 
