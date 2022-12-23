# author : Teerapat Phokhonwong
# Problem: 3231 - Horror List
# Link: https://www.beecrowd.com.br/judge/en/problems/view/3231
# Answer: Accepted
# Submission: 12/22/22, 4:59:18 PM
# Runtime: 0.090s
# Note: BFS ค้นหาความคล้ายกัน 

from typing import List, Tuple


def compute_horror_index(graph: List[List[int]], horror_list: List[int]) -> List[int]:
    # Initialize the horror index of each movie to infinity
    horror_index = [float("inf") for i in range(len(graph))]

    # Queue for BFS
    queue = []

    # Set the horror index of movies on the horror list to 0
    for movie in horror_list:
        horror_index[movie] = 0
        queue.append(movie)

    # Do BFS to compute the horror index of each movie
    while queue:
        movie = queue.pop(0)
        for neighbor in graph[movie]:
            if horror_index[neighbor] == float("inf"):
                horror_index[neighbor] = horror_index[movie] + 1
                queue.append(neighbor)

    return horror_index


def find_best_movie(N: int, H: int, L: int, horror_list: List[int], similarities: List[Tuple[int, int]]) -> int:
    # Construct the graph
    graph = [[] for i in range(N)]
    for a, b in similarities:
        graph[a].append(b)
        graph[b].append(a)

    # Compute the horror index of each movie
    horror_index = compute_horror_index(graph, horror_list)

    # Find the movie with the highest horror index
    best_movie = 0
    best_horror_index = 0
    for movie in range(N):
        if horror_index[movie] > best_horror_index:
            best_horror_index = horror_index[movie]
            best_movie = movie

    return best_movie


# Read input
N, H, L = map(int, input().split())
horror_list = list(map(int, input().split()))
similarities = [tuple(map(int, input().split())) for i in range(L)]

# Find the best movie
best_movie = find_best_movie(N, H, L, horror_list, similarities)

# Output the ID of the best movie
print(best_movie)
