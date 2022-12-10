# Problem: 3037 - Playing Darts by Distance
# Link: https://www.urionlinejudge.com.br/judge/en/problems/view/3037
# Answer: Accepted
# Submission: 4/3/20, 12:21:58 PM
# Runtime: 0.016s

if __name__ == "__main__":
    n = int(input())
    for i in range(n):
        john = mary = 0
        for j in range(3):
            x, d = map(int, input().split())
            john += (x*d)
        for j in range(3):
            x, d = map(int, input().split())
            mary += (x * d)

        if john >= mary:
            print('JOAO')
        else:
            print('MARIA')