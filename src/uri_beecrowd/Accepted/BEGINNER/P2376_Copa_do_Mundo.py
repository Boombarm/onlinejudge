class Node:
    def __init__(self, id, left, right):
        self.id = id
        self.left = left
        self.right = right
        self.leftNode = None
        self.rightNode = None
        self.hasNext = 0


if __name__ == '__main__':
    m = [Node] * 16
    for i in range(1, 16):
        a, b = map(int, input().split())
        m[i] = Node(i, a, b)
        if i <= 8:
            m[i].hasNext = 1

    m[15].leftNode = m[13]
    m[15].rightNode = m[14]
    m[14].leftNode = m[11]
    m[14].rightNode = m[12]
    m[13].leftNode = m[9]
    m[13].rightNode = m[10]
    m[12].leftNode = m[7]
    m[12].rightNode = m[8]
    m[11].leftNode = m[5]
    m[11].rightNode = m[6]
    m[10].leftNode = m[3]
    m[10].rightNode = m[4]
    m[9].leftNode = m[1]
    m[9].rightNode = m[2]
    m[8].Ldata = 'O'
    m[8].Rdata = 'P'
    m[7].Ldata = 'M'
    m[7].Rdata = 'N'
    m[6].Ldata = 'K'
    m[6].Rdata = 'L'
    m[5].Ldata = 'I'
    m[5].Rdata = 'J'
    m[4].Ldata = 'G'
    m[4].Rdata = 'H'
    m[3].Ldata = 'E'
    m[3].Rdata = 'F'
    m[2].Ldata = 'C'
    m[2].Rdata = 'D'
    m[1].Ldata = 'A'
    m[1].Rdata = 'B'

    x = m[15]
    while x.leftNode:
        if x.left > x.right:
            x = x.leftNode
        else:
            x = x.rightNode

    if x.left > x.right:
        print(x.Ldata)
    else:
        print(x.Rdata)
