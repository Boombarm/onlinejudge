# Problem: 3343 - Attack On Gasparini
# Answer: Accepted
# Language: Python 3.4 (Python 3.4.3) [+1s]
# Runtime: 0.748s
# File size: 750 Bytes
# Memory: -
# Submission: 4/3/22, 10:05:26 PM
# Author: Teerapat Phokhonwong
# Note: titans พังกำแพง เช็คกำแพงตั้งแต่จุดเริ่มต้นของ titans ไปจนกำแพงสุดท้ายที่สามารถจะป้องกันได้

in_size, wall_height = map(int, input().split())
wall_remain = [wall_height]
titans = input()
titan_size = dict()
last_wall = dict()
titan_size['P'], titan_size['M'], titan_size['G'] = map(int, input().split())
last_wall['P'] = last_wall['M'] = last_wall['G'] = 0
for t in titans:
    k = titan_size[t]
    wall_level = last_wall[t]
    is_alive = True
    while is_alive:
        if k <= wall_remain[wall_level]:
            wall_remain[wall_level] -= k
            is_alive = False
            break
        else:
            wall_level += 1
            last_wall[t] = wall_level
            if wall_level == len(wall_remain):
                wall_remain.append(wall_height)

total_wall = len(wall_remain)
print(total_wall)
