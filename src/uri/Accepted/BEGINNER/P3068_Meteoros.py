# Problem: 3068 - Meteóros
# Link: https://www.urionlinejudge.com.br/judge/en/problems/view/3068
# Original: https://olimpiada.ic.unicamp.br/passadas/OBI2001/programacao/
# Answer: Accepted
# Submission: 3/31/20, 10:00:39 PM
# Runtime: 0.800s

if __name__ == "__main__":
    t = 1
    while True:
        x1, y1, x2, y2 = map(int, input().split())
        if x1 == y1 == x2 == y2 == 0:
            break

        n = int(input())
        count = 0
        for i in range(n):
            x, y = map(int, input().split())
            if x1 <= x <= x2 and y2 <= y <= y1:
                count += 1
        print("Teste")
        print(t)
        print(count, end='\n')
        t += 1
