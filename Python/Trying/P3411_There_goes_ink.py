# author : Teerapat Phokhonwong
# Problem: 3411 - There goes ink!
# Link: https://www.beecrowd.com.br/judge/en/problems/view/3411
# Answer: Wrong answer (5%)
# Submission: 
# Runtime: 
# Note: 
try:
    w, h = map(int , input().split())
    board = [[""] * w] * h

    i = 0
    while i < h:
        text = input().strip()
        if text:
            text = text.replace("\r", "")
            board[i] = list(map(str , text.split()))
            i += 1

    x, y, v = map(int, input().split())
    old_color_value = board[x-1][y-1]
        
    spread_step = list()
    if x >= 1 and x <= w and y >= 1 and y <= h:
        spread_step.append({'x': x-1, 'y': y-1})
    while spread_step:
        pos = spread_step.pop(0)
        pos_x = pos['x']
        pos_y = pos['y']
        board[pos_y][pos_x] = str(v)
        # left
        if pos_x > 0 and board[pos_y][pos_x-1] == old_color_value:
            spread_step.append({'x': pos_x-1, 'y': pos_y})
        # right
        if pos_x < w-1 and board[pos_y][pos_x + 1] == old_color_value:
            spread_step.append({'x': pos_x+1, 'y': pos_y})
        # top
        if pos_y > 0 and board[pos_y-1][pos_x] == old_color_value:
            spread_step.append({'x': pos_x, 'y': pos_y-1})
        # bottom
        if pos_y < h-1 and board[pos_y+1][pos_x] == old_color_value:
            spread_step.append({'x': pos_x, 'y': pos_y+1})

    for i in range(h):
        row = " ".join(map(str, board[i])).strip()
        print(row , end='\n')
except EOFError:
    pass