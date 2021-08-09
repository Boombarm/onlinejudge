# Problem: 3301 - Middle Nephew
# Link: https://www.urionlinejudge.com.br/judge/en/problems/view/3301
# Answer: Accepted
# Submission: 8/10/21, 12:42:32 AM
# Runtime: 0.000s

class Nephew(object):

    def __init__(self, name, age):
        self.name = name
        self.age = age

    def __lt__(self, other):
        return self.age < other.age


H, Z, L = map(int, input().split())
c = [Nephew('huguinho', H), Nephew('zezinho', Z), Nephew('luisinho', L)]
c.sort()
print(c[1].name)
