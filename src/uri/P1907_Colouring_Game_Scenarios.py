# Date: 07-01-2019
# author : Teerapat Phokhonwong
# Online judge: URI Online Judge
# Categories: GRAPH
# Problem: 1907 - Colouring Game Scenarios
# Link: https://www.urionlinejudge.com.br/judge/en/problems/view/1907
# Timelimit: 1 sec
# Status: RTE
# Submission:
# Runtime:
# Solution:
# Note: this algorithm accepted by c++

R = C = 0
paper = []
visited = []


def hasPoint(r,c):
    return paper[r][c] == '.' and visited[r][c] != True;


def BFS(r,c):
    #TOP
    if r > 0 and hasPoint(r - 1, c):
        visited[r-1][c] = True
        BFS(r-1, c);

    #LEFT
    if c > 0 and hasPoint(r, c-1):
        visited[r][c-1] = True
        BFS(r, c-1)

    #RIGHT
    if c < C-1 and hasPoint(r,c+1):
        visited[r][c+1] = True
        BFS(r, c+1)

    #BOTTOM
    if r < R-1 and hasPoint(r+1, c):
        visited[r+1][c] = True
        BFS(r+1, c)



#Main
R, C = map(int, input().split())

for i in range(0, R):
    paper.append(list(input()))

for i in range(0, R):
    visited.append([False for j in range(C)])

totalClick = 0
for i in range(0, R):
    for j in range(0, C):
        if paper[i][j] == '.' and visited[i][j] != True :
            visited[i][j] = True
            BFS(i, j)
            totalClick+=1


print(totalClick)
#End Main