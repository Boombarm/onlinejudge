# author : Teerapat Phokhonwong
# Online judge: URI Online Judge
# Categories: AD-HOC
# Problem: 2394 - Corrida 1
# Link: https://www.urionlinejudge.com.br/judge/en/problems/view/2394
# Timelimit: 1 sec
# Status: Accepted
# Submission: 6/24/20, 7:35:12 PM
# Runtime: 0.036s
# Solution:
# Note:

class Person:
    def __init__(self, id, time):
        self.id = id
        self.time = time

    def __lt__(self, other):
        if self.time < other.time:
            return 1

    def __gt__(self, other):
        if self.time > other.time:
            return 1


n, m = map(int, input().split())
t = []
for i in range(n):
    total = 0
    x = map(int, input().split())
    for j in x:
        total += j
    t.append(Person(i + 1, total))
t.sort()
print(t[0].id)
