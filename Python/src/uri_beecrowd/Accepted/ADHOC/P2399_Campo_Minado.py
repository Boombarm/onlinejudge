N = int(input())
board = []
for i in range(N):
    board.append(int(input()))
 
for i in range(0,N):
    x = 0
    if board[i] == 1 : x = 1
    if i > 0 and board[i-1] == 1 : x += 1
    if i < N-1 and board[i+1] == 1 : x += 1
    print(x)

