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
        # print("wall_{wall_level} -> {t}{size}".format(wall_level=wall_level, t=t, size=titan_size[t]))
        if k <= wall_remain[wall_level]:
            # print('{wall_size} - {size} = {remain}'.format(wall_size=wall_remain[wall_level], size=titan_size[t], remain=wall_remain[wall_level] - titan_size[t]))
            wall_remain[wall_level] -= k
            # print('die')
            is_alive = False
            break
        else:
            wall_level += 1
            last_wall[t] = wall_level
            # print('jump')
            if wall_level == len(wall_remain):
                # print('new wall')
                wall_remain.append(wall_height)
# print(wall_remain)
total_wall = len(wall_remain)
print(total_wall)
