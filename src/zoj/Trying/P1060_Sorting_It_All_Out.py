



class Node():
    def __init__(self,left=None, right=None):
        self.left = left
        self.right = right

# print(ord('A'), ord('Z'))


def getId(Character):
    return ord(Character)-65


#main
line = list(input())

while True:
    n , m = map(int, input().split())
    if n == 0 and m == 0 : break
    node = [Node(i) for i in range(n)]

    line = list(input())
    getId(line[0])
    counting = 1
