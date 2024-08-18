# author : Teerapat Phokhonwong
# Problem: 3171 - String Led
# Link: https://judge.beecrowd.com/en/problems/view/3171
# Answer: Accepted
# Submission: 3/30/24, 8:50:58 PM
# Runtime: 0.038s

def is_complete(N, connections):
    graph = [[] for _ in range(N)]
    visited = [False] * N

    for x, y in connections:
        graph[x - 1].append(y - 1)
        graph[y - 1].append(x - 1)

    def dfs(node):
        visited[node] = True
        for neighbor in graph[node]:
            if not visited[neighbor]:
                dfs(neighbor)

    dfs(0)
    return all(visited)

N, L = map(int, input().split())
connections = [tuple(map(int, input().split())) for _ in range(L)]

# Check if LED string is complete
result = is_complete(N, connections)

if result:
    print('COMPLETO')
else:
    print('INCOMPLETO')