from collections import deque

def is_goal(state):
    # Check if all lions are on the right and all snakes are on the left
    return state == ['S']*5 + ['_'] + ['L']*5

def get_neighbors(state):
    neighbors = []
    empty_index = state.index('_')
    if empty_index > 0:
        # Move left neighbor to the right
        if state[empty_index - 1] != '_':
            new_state = state[:]
            new_state[empty_index], new_state[empty_index - 1] = new_state[empty_index - 1], new_state[empty_index]
            neighbors.append(new_state)
        # Move two steps left neighbor to the right
        if empty_index > 1 and state[empty_index - 2] != '_':
            new_state = state[:]
            new_state[empty_index], new_state[empty_index - 2] = new_state[empty_index - 2], new_state[empty_index]
            neighbors.append(new_state)
    if empty_index < len(state) - 1:
        # Move right neighbor to the left
        if state[empty_index + 1] != '_':
            new_state = state[:]
            new_state[empty_index], new_state[empty_index + 1] = new_state[empty_index + 1], new_state[empty_index]
            neighbors.append(new_state)
        # Move two steps right neighbor to the left
        if empty_index < len(state) - 2 and state[empty_index + 2] != '_':
            new_state = state[:]
            new_state[empty_index], new_state[empty_index + 2] = new_state[empty_index + 2], new_state[empty_index]
            neighbors.append(new_state)
    return neighbors

def bfs(start):
    queue = deque([(start, [])])
    visited = set()
    visited.add(tuple(start))

    while queue:
        current_state, path = queue.popleft()
        
        if is_goal(current_state):
            return path

        for neighbor in get_neighbors(current_state):
            if tuple(neighbor) not in visited:
                visited.add(tuple(neighbor))
                queue.append((neighbor, path + [neighbor]))
    return None

# Initial state
initial_state = ['L', 'L', 'L', 'L', 'L', '_', 'S', 'S', 'S', 'S', 'S']

# Run BFS to find the solution
solution = bfs(initial_state)

if solution:
    print("Solution found!")
    for step in solution:
        print(' '.join(step))
else:
    print("No solution found.")