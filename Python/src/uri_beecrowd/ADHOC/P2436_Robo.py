# author : Teerapat Phokhonwong
# Problem: BEECROWD 2436 - Robô
# Link: https://www.beecrowd.com.br/judge/en/problems/view/2436
# Answer: Accepted
# Submission: 8/24/23, 8:16:04 PM
# Runtime: 0.047s
# Note: ให้หุ่นยนต์เดินตามเส้นทาง กำหนดเป็นเลข 1 คือ เส้นทาง และให้หุ่นยนต์จำทางก่อนหน้า

board_row, board_column = map(int , input().split())
r, c = map(int , input().split())

arr = [[0]  * board_column ]  * board_row
memo = [ [0] * board_column for i in range(board_row)]
for i in range(board_row):
    arr[i] = list(map(int , input().split()))

r = r - 1
c = c - 1
board_column = board_column - 1
board_row = board_row -1
last_r = r 
last_c = c
memo[r][c] = 1
while True:
    is_found = False
    if r > 0 and memo[r-1][c] == 0 and arr[r-1][c] == 1: # top
        r = r - 1
        is_found = True
    elif r < board_row and memo[r+1][c] == 0 and arr[r+1][c] == 1: # down
        r = r + 1
        is_found = True
    elif c > 0 and memo[r][c-1] == 0 and arr[r][c-1] == 1: # left
        c = c - 1
        is_found = True
    elif c < board_column and memo[r][c+1] == 0 and arr[r][c+1] == 1:  # right  
        c = c + 1
        is_found = True
    if is_found:
        last_r = r
        last_c = c
        memo[r][c] = 1
    else:
        break
    

print(last_r+1, last_c+1)
# 3 5
# 1 1
# 1 0 0 0 1
# 1 0 0 1 1
# 1 1 1 1 0

# 4 7
# 3 4
# 0 0 1 1 1 1 1
# 1 1 1 0 0 0 1
# 1 0 0 1 0 1 1
# 1 1 0 1 1 1 0