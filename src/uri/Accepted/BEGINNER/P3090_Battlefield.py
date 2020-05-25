# Problem: 3090 - Battlefield
# Link: https://www.urionlinejudge.com.br/judge/en/problems/view/3090
# Answer: Accepted
# Submission: 5/25/20, 3:09:43 PM
# Runtime: 0.352s


class Point:
    def __init__(self, x, y):
        self.x = x
        self.y = y


def esq(a, b, p):
    return (p.y - a.y) * (b.x - a.x) - (p.x - a.x) * (b.y - a.y) > 0


if __name__ == "__main__":
    n, m, s = map(int, input().split())
    a = Point(0, 0)
    b = Point(n, m)
    battlefield = []
    team_1, team_2 = 0, 0
    for i in range(s):
        x, y, val = map(int, input().split())
        if esq(a, b, Point(x, y)):
            team_1 += val
        else:
            team_2 += val
    print(team_1, team_2)
