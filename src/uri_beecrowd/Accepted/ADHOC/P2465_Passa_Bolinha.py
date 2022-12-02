# author : Teerapat Phokhonwong
# Online judge: URI Online Judge
# Categories: AD-HOC
# Problem: 2465 - Passa Bolinha
# Link: https://www.urionlinejudge.com.br/judge/en/problems/view/2465
# Timelimit: 1 sec
# Status: Accepted
# Submission: 10/29/19, 10:43:52 AM
# Runtime: 0.040s
# Solution: BFS
# Note:

class Node:
    def __init__(self, i, j, number):
        self.i = i
        self.j = j
        self.number = number


if __name__ == '__main__':
    N = int(input())
    I, J = map(int, input().split())
    table = [None] * N
    visited = [[0 for x in range(N)] for y in range(N)]
    for i in range(0, N):
        table[i] = list(input().split())

    Q = list()
    Q.append(Node(I - 1, J - 1, table[I - 1][J - 1]))
    visited[I - 1][J - 1] = 1
    total = 1

    while Q:
        x = Q.pop()
        number = x.number
        i = x.i
        j = x.j

        # top
        if i > 0 and visited[i - 1][j] == 0 and number <= table[i - 1][j]:
            # print('top')
            Q.append(Node(i - 1, j, table[i - 1][j]))
            visited[i - 1][j] = 1
            total += 1

        # left
        if j > 0 and visited[i][j - 1] == 0 and table[i][j - 1] >= number:
            # print('left')
            Q.append(Node(i, j - 1, table[i][j - 1]))
            visited[i][j - 1] = 1
            total += 1

        # right
        if j < N - 1 and visited[i][j + 1] == 0 and table[i][j + 1] >= number:
            # print('right')
            Q.append(Node(i, j + 1, table[i][j + 1]))
            visited[i][j + 1] = 1
            total += 1

        # bottom
        if i < N - 1 and visited[i + 1][j] == 0 and table[i + 1][j] >= number:
            # print('bottom')
            Q.append(Node(i + 1, j, table[i + 1][j]))
            visited[i + 1][j] = 1
            total += 1

    print(total)
