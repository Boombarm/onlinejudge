# character 1 represents ⌜ => UP TO RIGHT (UR) | LEFT TO DOWN (LD)
# character 2 represents ⌝ => RIGHT TO DOWN (RD) | UP TO LEFT (UL)
# character 3 represents ⌟ => RIGHT TO UP (RU) | DOWN TO LEFT (DL)
# character 4 represents  ⌞=> LEFT TO UP (LU) | DOWN TO RIGHT (DR)

class Word:
    def __init__(self, x , y , counter, direction=None, start_x=None, start_y=None):
        self.start_x = start_x
        self.start_y = start_y
        self.x = x
        self.y = y
        self.counter = counter
        self.direction = direction

class PriorityQueue(object):
    def __init__(self):
        self.queue = []
 
    def isEmpty(self):
        return len(self.queue) == 0
 
    def insert(self, data):
        idx = 0
        for i in range(len(self.queue)):
            if data.counter > self.queue[i].counter:
                break
            idx += 1
        self.queue.insert(idx, data)
        
    def delete(self):
        item = self.queue[0]
        del self.queue[0]
        return item

n, m = map(int, input().split())
board = [[] * m ] * n

idx = 0
for i in range(n):
    arr = list(input())
    board[idx] = arr
    idx += 1

def search(word):
    size = len(word)
    step = PriorityQueue()
    for y in range(n):
        for x in range(m):
            if board[y][x] == word[0]:
                step.insert(Word(x=x, y=y, start_x=x ,start_y=y, counter=1))
    
    while not step.isEmpty():
        word_data = step.delete()
        if word_data.counter == size:
            return f"{word_data.start_y+1} {word_data.start_x+1} {word_data.direction}"
        counter = word_data.counter
        pos_x = word_data.x
        pos_y = word_data.y
        
        # TOP
        if pos_y-1 >= 0:
            if counter == 1:
                word_data.direction = "U"
            if pos_x+1 < m \
                and board[pos_y-1][pos_x] == "1" \
                and board[pos_y-1][pos_x + 1] == word[counter]: # UR
                step.insert(Word(x=pos_x + 1, y=pos_y - 1, 
                                    counter=word_data.counter+1, direction=word_data.direction, 
                                    start_x= word_data.start_x, start_y= word_data.start_y
                                    ))
            elif pos_x-1 >= 0 \
                and board[pos_y-1][pos_x] == "2" \
                and board[pos_y-1][pos_x - 1] == word[counter]: # UL
                step.insert(Word(x=pos_x - 1, y=pos_y - 1, 
                                    counter=word_data.counter+1, direction=word_data.direction,
                                    start_x= word_data.start_x, start_y= word_data.start_y
                                    ))
            elif pos_y - 2 >= 0 \
                and (board[pos_y-1][pos_x] == "3" or board[pos_y-1][pos_x] == "4") \
                and board[pos_y-2][pos_x] == word[counter]:
                step.insert(Word(x=pos_x, y=pos_y -2, 
                                    counter=word_data.counter+1, direction=word_data.direction,
                                    start_x= word_data.start_x, start_y= word_data.start_y
                                    ))
            elif board[pos_y-1][pos_x] == word[counter]:
                step.insert(Word(x=pos_x, y=pos_y - 1, 
                                    counter=word_data.counter+1, direction=word_data.direction,
                                    start_x= word_data.start_x, start_y= word_data.start_y
                                    ))
        
        # BOTTOM
        if pos_y+1 <= n-1:
            if counter == 1:
                word_data.direction = "D"
            if pos_x - 1 >= 0 \
            and board[pos_y+1][pos_x] == "3" and board[pos_y+1][pos_x - 1] == word[counter]: # DL
                step.insert(Word(x=pos_x - 1, y=pos_y + 1, 
                                    counter=word_data.counter+1, direction=word_data.direction,
                                    start_x= word_data.start_x, start_y= word_data.start_y
                                    ))
            elif pos_x + 1 < m \
                and board[pos_y+1][pos_x] == "4" and  board[pos_y+1][pos_x + 1] == word[counter]: # DR
                step.insert(Word(x=pos_x + 1, y=pos_y + 1, 
                                    counter=word_data.counter+1, direction=word_data.direction,
                                    start_x= word_data.start_x, start_y= word_data.start_y
                                    ))
            elif pos_y + 2 < n \
                and (board[pos_y+1][pos_x] == "1" or board[pos_y+1][pos_x] ==  "2"):
                step.insert(Word(x=pos_x, y=pos_y + 2, 
                                    counter=word_data.counter+1, direction=word_data.direction,
                                    start_x= word_data.start_x, start_y= word_data.start_y
                                    ))
            elif  board[pos_y+1][pos_x] == word[counter]:
                step.insert(Word(x=pos_x, y=pos_y + 1, 
                                    counter=word_data.counter+1, direction=word_data.direction,
                                    start_x= word_data.start_x, start_y= word_data.start_y
                                    ))
                
        # LEFT
        if pos_x-1 >= 0:
            
            if counter == 1:
                word_data.direction = "L"
                
            if pos_y + 1 < n \
                and board[pos_y][pos_x-1] == "1" and board[pos_y+1][pos_x - 1] == word[counter]: # LD
                step.insert(Word(x=pos_x - 1, y=pos_y + 1, 
                                    counter=word_data.counter+1, direction=word_data.direction,
                                    start_x= word_data.start_x, start_y= word_data.start_y
                                    ))
            elif pos_y - 1 >= 0 \
                and board[pos_y][pos_x-1] == "4" and board[pos_y-1][pos_x - 1] == word[counter]: # LU
                step.insert(Word(x=pos_x - 1, y=pos_y - 1, 
                                    counter=word_data.counter+1, direction=word_data.direction,
                                    start_x= word_data.start_x, start_y= word_data.start_y
                                    ))
            elif pos_x - 2 >= 0 and (board[pos_y][pos_x - 1] == "2" or board[pos_y][pos_x - 1] == "3"):
                step.insert(Word(x=pos_x - 2, y=pos_y, 
                                    counter=word_data.counter+1, direction=word_data.direction,
                                    start_x= word_data.start_x, start_y= word_data.start_y
                                    ))
            elif board[pos_y][pos_x-1] == word[counter]:
                step.insert(Word(x=pos_x-1, y=pos_y, 
                                    counter=word_data.counter+1, direction=word_data.direction,
                                    start_x= word_data.start_x, start_y= word_data.start_y
                                    ))
                
        # RIGHT
        if pos_x+1 <= m-1:
            if counter == 1:
                word_data.direction = "R"
            if pos_y + 1 < n \
                and board[pos_y][pos_x+1] == "2" and board[pos_y+1][pos_x + 1] == word[counter]: # RD
                step.insert(Word(x=pos_x + 1, y=pos_y + 1, 
                                    counter=word_data.counter+1, direction=word_data.direction,
                                    start_x= word_data.start_x, start_y= word_data.start_y
                                    ))
            elif pos_y - 1 >= 0 and board[pos_y][pos_x+1] == "3" and board[pos_y-1][pos_x + 1] == word[counter]: # RU
                step.insert(Word(x=pos_x + 1, y=pos_y - 1, 
                                    counter=word_data.counter+1, direction=word_data.direction,
                                    start_x= word_data.start_x, start_y= word_data.start_y
                                    ))
            elif pos_x + 2 < m and (board[pos_y][pos_x + 1] == "1" or board[pos_y][pos_x + 1] == "4"):
                step.insert(Word(x=pos_x + 2, y=pos_y, 
                                    counter=word_data.counter+1, direction=word_data.direction,
                                    start_x= word_data.start_x, start_y= word_data.start_y
                                    ))
            elif board[pos_y][pos_x+1] == word[counter]:
                step.insert(Word(x=pos_x+1, y=pos_y, 
                                    counter=word_data.counter+1, direction=word_data.direction,
                                    start_x= word_data.start_x, start_y= word_data.start_y
                                    ))
        
    return ":("


q = int(input())
for i in range(q):
    word = input()
    answer = search(word)
    print(answer)
