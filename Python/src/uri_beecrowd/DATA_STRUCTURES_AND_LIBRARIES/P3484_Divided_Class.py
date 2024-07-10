# author : Teerapat Phokhonwong
# Problem: 3484 - https://judge.beecrowd.com/en/problems/view/3484
# Link: https://judge.beecrowd.com/en/problems/view/3484
# Answer: Accepted
# Submission: 7/10/24, 7:32:03 PM 
# Runtime: 0.155s
# Note: สร้าง binary tree ที่เช็คค่าตามความสูงที่โจทย์กำหนด และแสดงคำตอบ node ที่เล็กสุด

from collections import deque

class Node:
    def __init__(self, number):
        self.number = number
        self.left = None
        self.right = None

def insert_into_tree(root, value):
    queue = deque([root])
    while queue:
        node = queue.popleft()
        
        if value <= node.number:
            if not node.left:
                node.left = Node(value)
                break
            else:
                queue.append(node.left)
        else:
            if not node.right:
                node.right = Node(value)
                break
            else:
                queue.append(node.right)

def find_smallest_per_level(root):
    if not root:
        return []

    queue = deque([root])
    result = []

    level = 0
    while queue:
        level_size = len(queue)
        level_min = float('inf')
        for _ in range(level_size):
            node = queue.popleft()
            level_min = min(level_min, node.number)
            if node.left:
                queue.append(node.left)
            if node.right:
                queue.append(node.right)
        result.append((level, level_min))
        level += 1
    
    return result

# Test
# n = 9
# nums = [130, 120, 140, 115, 125, 135, 145, 142, 138]
# n = 3
# nums = [100 ,120 ,115]
# n = 3
# nums = [115, 120, 110]

n = int(input())
nums = list(map(int, input().split()))

# Create binary tree with compare
root = Node(nums[0])
for height in nums[1:]:
    insert_into_tree(root, height)


smallest_per_level = find_smallest_per_level(root)
for level, height in smallest_per_level:
    print(f"{level} {height}")