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
