# author : Teerapat Phokhonwong
# Problem: 3250 - Elevator Trouble
# Link: https://www.beecrowd.com.br/judge/en/problems/view/3250
# Answer: Accepted
# Submission: 12/14/22, 6:43:24 PM
# Runtime: 1.947s
# Note: BFS

class PriorityQueue(object):
    def __init__(self):
        self.queue = []
 
    def isEmpty(self):
        return len(self.queue) == 0

    def insert(self, data):
        idx = 0
        for item in self.queue:
            if data.button_presses < item.button_presses:
                break
            idx += 1
        self.queue.insert(idx, data)
 
    def pop(self):
        item = self.queue[0]
        del self.queue[0]
        return item

class Floor:
    def __init__(self, current_floor, button_presses, visited_floors) -> None:
        self.current_floor = current_floor
        self.button_presses = button_presses
        self.visited_floors = visited_floors

def elevator_distance(f, s, g, u, d):
    queue = PriorityQueue()
    queue.insert(Floor(current_floor=s, button_presses=0, visited_floors=[0] * (f + 1)))
    while not queue.isEmpty() :
        floor = queue.pop()
        current_floor = floor.current_floor
        button_presses = floor.button_presses
        visited_floors = floor.visited_floors
        if current_floor == g:
            return button_presses

        if visited_floors[current_floor] == 0:
            visited_floors[current_floor] = 1

        up = current_floor + u
        if up <= f and visited_floors[up] == 0:
            visited_floors[up] = 1
            queue.insert(Floor(up, button_presses+1, visited_floors ))
        
        down = floor.current_floor - d
        if down >= 1 and visited_floors[down] == 0 :
            visited_floors[down] = 1
            queue.insert(Floor(down, button_presses+1, visited_floors))

    return "use the stairs"

f, s, g, u, d = map(int, input().split())
print(elevator_distance(f, s, g, u, d))
