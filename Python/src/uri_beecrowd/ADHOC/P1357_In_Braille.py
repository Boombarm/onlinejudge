# Date: 07-04-2020
# author : Teerapat Phokhonwong
# Online judge: URI Online Judge
# Categories: AD-HOC
# Problem: 1357 - In Braille
# Link: https://www.urionlinejudge.com.br/judge/en/problems/view/1357
# Timelimit: 1 sec
# Status: Accepted
# Submission: 4/7/20, 2:10:56 PM
# Runtime: 0.152s
# Solution: Map
# Note:

S = [
    ['.*', '**'],  # 0
    ['*.', '..'],  # 1
    ['*.', '*.'],  # 2
    ['**', '..'],  # 3
    ['**', '.*'],  # 4
    ['*.', '.*'],  # 5
    ['**', '*.'],  # 6
    ['**', '**'],  # 7
    ['*.', '**'],  # 8
    ['.*', '*.'],  # 9
]

B = {
    '*.': {
        '..': 1,
        '*.': 2,
        '.*': 5,
        '**': 8
    },
    '**': {
        '..': 3,
        '.*': 4,
        '*.': 6,
        '**': 7
    },
    '.*': {
        '*.': 9,
        '**': 0
    }

}

if __name__ == "__main__":
    while True:
        d = int(input())
        if d == 0:
            break
        m = input()
        if m == 'S':
            num_list = list(input())
            for i in range(2):
                isPrinted = 0
                for j in range(d):
                    if isPrinted == 0:
                        isPrinted = 1
                    else:
                        print(' ', end='')
                    print(S[int(num_list[j])][i], end='')
                print()
            isPrinted = 0
            for j in range(d):
                if isPrinted == 0:
                    isPrinted = 1
                else:
                    print(' ', end='')
                print('..', end='')
            print()
        elif m == 'B':
            line1 = input().split()
            line2 = input().split()
            input()
            for i in range(d):
                print(B[line1[i]][line2[i]], end='')
            print()
