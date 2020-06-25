# Problem: 3093 - Guys' Truco 1.0
# Link: https://www.urionlinejudge.com.br/judge/en/problems/view/3093
# Answer: Accepted
# Submission: 6/24/20, 11:25:32 PM
# Runtime: 0.020s


def solve(card_list):
    chk_list = ['Q', 'J', 'K', 'A']
    chk_status = [0, 0, 0, 0]
    c = 0
    for j in card_list:
        for k in range(4):
            if j == chk_list[k] and chk_status[k] == 0:
                c += 1
                if c == 4:
                    return 1
                chk_status[k] = 1
    return 0


n = int(input())
for i in range(n):

    cards = list(input())
    chk = solve(cards)
    if chk == 1:
        print('Aaah muleke')
    else:
        print('Ooo raca viu')
