from collections import deque


def is_valid(n, m):
    cities = deque(range(n))
    while cities.popleft() != 12:
        for _ in range(m - 1):
            cities.append(cities.popleft())
    return len(cities) == 0


def solve(n):
    m = 1
    while not is_valid(n, m):
        m += 1
    return m


n = int(input())
while n != 0:
    print(solve(n))
    n = int(input())
