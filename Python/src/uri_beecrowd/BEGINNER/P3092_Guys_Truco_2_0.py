# Problem: 3092 - Guys' Truco 2.0
# Link: https://www.urionlinejudge.com.br/judge/en/problems/view/3092
# Answer: Accepted
# Submission: 6/24/20, 11:11:09 PM
# Runtime: 0.024s


def solve(cards):
    global step
    k = 0
    for j in cards:
        if step[k] == j:
            k += 1
            if k == 4:
                return 1
    return 0


n = int(input())
step = ['Q', 'J', 'K', 'A']
win = 0
for i in range(n):
    cards = list(input())
    chk = solve(cards)
    if chk == 1:
        print('Agora vai')
    else:
        print('Agora apertou sem abracar')
