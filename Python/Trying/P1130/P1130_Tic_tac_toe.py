memo = None

class Sim:
    def __init__(self, board, memo, idx, turn, round) -> None:
        self.board = board
        self.memo = memo
        self.idx = idx
        self.turn = turn
        self.round = round

input_file = open("Python/Trying/P1130/input.txt", "r")
while True:
    # n = int(input())
    n = int(input_file.readline())
    if n == 0:
        break

    # _board_input = input()
    _board_input = input_file.readline().replace('\n' , '')
    board = list(_board_input)
    memo = list(_board_input)
    # _board_input = list(input())
    # print(_board_input)
    # print("".join(_board_input[0: 3]))

    # first Step
    step = list()
    for i in range(n):
        if board[i] == '.':
            step.append(Sim(board, memo, idx=i, turn="Mary", round=1))

    isWin = False

    while step:
        sim = step.pop(0)
        sim_board = sim.board
        sim_memo = sim.memo
        idx = sim.idx
        print("round:", sim.round)
        print(f"{sim.turn} turn!")
        if sim.turn == "Mary" and sim_memo[idx] == '.':            
            sim_memo[idx] = 'X'
            sim_board[idx] = 'X'
            print(sim_board, "\n")
            if idx >= 2 and "".join(sim_board[idx-2: idx]) == "XXX": # check from Right 
                isWin = True
                print('win')
                break
            if idx <= n-2 and "".join(sim_board[idx: idx+2]) == "XXX": # check from Left 
                isWin = True
                print('win')
                break
            if idx >= 1 and idx < n-1 and "".join(sim_board[idx-1: idx+1]) == "XXX": # check from Mid
                isWin = True
                print('win')
                break
        else:
            print(sim_board, "\n")

        # fill left 
        i = idx
        while i > 0:
            if sim_memo[i] == '.':
                temp_board = sim_board
                temp_memo = sim_memo
                next_turn = "Mary" if sim.turn != "Mary" else "Enemy"
                temp_board[idx] = "X" if next_turn == "Mary" else "O"
                temp_memo[idx] = "X" if next_turn == "Mary" else "O"
                step.append(Sim(board=temp_board, memo=temp_memo,idx=i, turn=next_turn,round=sim.round + 1))
            i -= 1

        
         # fill right
        i = idx
        while i < n:
            if sim_memo[i] == '.':
                temp_board = sim_board
                temp_memo = sim_memo
                next_turn = "Mary" if sim.turn != "Mary" else "Enemy"
                temp_board[idx] = "X" if next_turn == "Mary" else "O"
                temp_memo[idx] = "X" if next_turn == "Mary" else "O"
                step.append(Sim(board=temp_board, memo=temp_memo,idx=i, turn=next_turn, round=sim.round + 1))
            i += 1
    
    print("S" if isWin else "N")
        
        
