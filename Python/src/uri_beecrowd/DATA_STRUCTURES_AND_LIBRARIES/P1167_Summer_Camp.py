# author : Teerapat Phokhonwong
# Problem: 1167 - Summer Camp
# Link: https://judge.beecrowd.com/en/problems/view/1167
# Answer: Accepted
# Submission: 8/17/24, 10:02:50 PM
# Runtime: 0.267s


def find_winner(children):
    clockwise = True
    index = 0 # เริ่มจากคนแรก
    token = children[index][1] # token from player
    
    while len(children) > 1:
        clockwise = token % 2 == 0

        if not clockwise:
            index = (index + token) % len(children) # หา index ตามเข็มนาฬิกา
        else:
            index = (index - token) % len(children)
            
        # next round
        token = children[index][1]
        del children[index]
        clockwise = token % 2 == 0
        if not clockwise:
            if index == 0:
                index = len(children) - 1
            else:
                index -= 1
            
                
    return children[0][0]

while True:
    num_children = int(input())
    if num_children == 0:
        break

    children = []
    for _ in range(num_children):
        name, token = input().split()
        children.append((name, int(token)))

    
    winner = find_winner(children)
    print(f"Vencedor(a): {winner}")