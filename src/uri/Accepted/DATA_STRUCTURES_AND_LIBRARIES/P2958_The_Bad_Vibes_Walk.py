# Problem: 2958 - The Bad Vibes Walk
# Link: https://www.urionlinejudge.com.br/judge/en/problems/view/2958
# Answer: Accepted
# Submission: 6/17/20, 11:45:30 PM
# Runtime: 0.068s

# todo python class sort compare
class Problem:
    def __init__(self, level, type):
        self.level = level
        self.type = type

    def __lt__(self, other):
        if self.type == 'V' and other.type == 'D':
            return 1
        if self.type == other.type and self.level > other.level:
            return 1

    def __gt__(self, other):
        if self.type == 'D' and other.type == 'V':
            return 1
        if self.type == other.type and self.level < other.level:
            return 1


n, m = map(int, input().split())
out = []
for i in range(n):
    p = input().split()
    for j in p:
        t = j[-1]
        v = int(j[:-1])
        out.append(Problem(v, t))
out.sort()
for x in out:
    print(str(x.level) + "" + x.type)
