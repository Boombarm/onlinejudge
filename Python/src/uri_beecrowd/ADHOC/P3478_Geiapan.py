# author : Teerapat Phokhonwong
# Problem: 3478 - Geiapan
# Categories: AD-HOC
# Link: https://judge.beecrowd.com/en/problems/view/3478
# Answer: Accepted
# Submission: 3/30/24, 7:39:36 PM
# Runtime: 0.674s
# FILE SIZE: 1.11 KB
# Note: จัดกลุ่ม nodes

class UnionFind:
    def __init__(self, n):
        self.parent = [i for i in range(n)]
        self.rank = [0] * n

    def find(self, u):
        if self.parent[u] != u:
            self.parent[u] = self.find(self.parent[u])
        return self.parent[u]

    def union(self, u, v):
        root_u = self.find(u)
        root_v = self.find(v)

        if root_u == root_v:
            return

        if self.rank[root_u] < self.rank[root_v]:
            self.parent[root_u] = root_v
        elif self.rank[root_u] > self.rank[root_v]:
            self.parent[root_v] = root_u
        else:
            self.parent[root_v] = root_u
            self.rank[root_u] += 1


def count_countries(C, F, borders):
    uf = UnionFind(C)
    for X, Y in borders:
        uf.union(X - 1, Y - 1)

    countries = set()
    for i in range(C):
        countries.add(uf.find(i))

    return len(countries)


C, F = map(int, input().split())
borders = []
for _ in range(F):
    X, Y = map(int, input().split())
    borders.append((X, Y))

num_countries = count_countries(C, F, borders)
print(num_countries)


    