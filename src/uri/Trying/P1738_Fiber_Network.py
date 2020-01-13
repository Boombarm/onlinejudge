# https://www.urionlinejudge.com.br/judge/en/problems/view/1738

class Node:
    chr = [None] * 26

    def __init__(self, id, ch):
        self.id = id
        for x in ch:
            chr[ord(x) - ord('a')] = 1

def getIndex(ch):
    return ord('a')-ord(ch)

if __name__ == "__main__":
    n = int(input())
    nodeArr = [Node] * n
    while True:
        insp = input().split()
        if len(insp) == 3: a, b, ch = map(str, insp)
        else: a, b = map(str, insp)
        if a == 0 and b == 0: break
        # for x in ch:
        #     nodeArr[getIndex(a)].chr(getIndex(x)) =


    while True:
        a, b = map(str, input().split())
        if a == 0 and b == 0: break
        # print(a, b)



