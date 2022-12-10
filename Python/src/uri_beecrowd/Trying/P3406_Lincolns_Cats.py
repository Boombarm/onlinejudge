# author : Teerapat Phokhonwong
# Problem: 3406 - Lincoln's Cats
# Link: https://www.beecrowd.com.br/judge/en/problems/view/3406
# Answer: TLE
# Submission:
# Runtime: 
import copy

def getSum(BITree: list, index: int) -> int:
    summ = 0 # Initialize result
 
    # index in BITree[] is 1 more than the index in arr[]
    index = index + 1
 
    # Traverse ancestors of BITree[index]
    while index > 0:
 
        # Add current element of BITree to sum
        summ += BITree[index]
 
        # Move index to parent node in getSum View
        index -= index & (-index)
    return summ
 
# Updates a node in Binary Index Tree (BITree) at given
# index in BITree. The given value 'val' is added to
# BITree[i] and all of its ancestors in tree.
def updateBit(BITTree: list, n: int, index: int, val: int) -> None:
 
    # index in BITree[] is 1 more than the index in arr[]
    index = index + 1
 
    # Traverse all ancestors and add 'val'
    while index <= n:
 
        # Add 'val' to current node of BI Tree
        BITTree[index] += val
 
        # Update index to that of parent in update View
        index += index & (-index)
 
 
# Returns the sum of array from [0, x]
def summation(x: int, BITTree1: list, BITTree2: list) -> int:
    return (getSum(BITTree1, x) * x) - getSum(BITTree2, x)
 
 
def updateRange(BITTree1: list, BITTree2: list, n: int, val: int, l: int,
                r: int) -> None:
 
    # Update Both the Binary Index Trees
    # As discussed in the article
 
    # Update BIT1
    updateBit(BITTree1, n, l, val)
    updateBit(BITTree1, n, r + 1, -val)
 
    # Update BIT2
    updateBit(BITTree2, n, l, val * (l - 1))
    updateBit(BITTree2, n, r + 1, -val * r)
 
def rangeSum(l: int, r: int, BITTree1: list, BITTree2: list) -> int:
 
    # Find sum from [0,r] then subtract sum
    # from [0,l-1] in order to find sum from
    # [l,r]
    return summation(r, BITTree1, BITTree2) - summation(
        l - 1, BITTree1, BITTree2)
 
 
# n, m = map(int , input().split())
# cats = [0] * (n + 1)
# arr = list(map(int, input().split()))
# idx = 1
# for data in arr:
#     cats[idx] = data
#     idx += 1



if __name__ == "__main__":
    n = 4
    m = 5
    cats = [10, 20, 30, 40, 50]
    bitTree1 = copy.copy(cats)
    bitTree2 = copy.copy(cats)
    # bitTree2 = [0] * (n + 1)
    print(bitTree1)
    for i in range(m):
        command = list(map(int , input().split()))
        if command[0] == 0:
            i = command[1]
            j = command[2]
            v  = command[3]
            updateRange(bitTree1, bitTree2, n, v, i, j)
        elif command[0] == 1:
            i = command[1]
            j = command[2]
            print(rangeSum(i, j, bitTree1, bitTree2))
        
