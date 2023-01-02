# Problem: 3053 - Jogo dos copos
# Link: https://www.urionlinejudge.com.br/judge/en/problems/view/3053
# Answer: Accepted
# Submission: 4/3/20, 12:01:26 PM
# Runtime: 0.024s

if __name__ == "__main__":
    n = int(input())
    coin = input()
    for i in range(n):
        swap = int(input())
        if swap == 1:
            if coin == 'A':
                coin = 'B'
            elif coin == 'B':
                coin = 'A'
        elif swap == 2:
            if coin == 'B':
                coin = 'C'
            elif coin == 'C':
                coin = 'B'
        elif swap == 3:
            if coin == 'A':
                coin = 'C'
            elif coin == 'C':
                coin = 'A'

    print(coin)
