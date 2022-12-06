# Python program to demonstrate Range Update
# and Range Queries using BIT
 
# Returns sum of arr[0..index]. This function assumes
# that the array is preprocessed and partial sums of
# array elements are stored in BITree[]
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
 
# Driver Code
if __name__ == "__main__":
    n = 5
 
    # BIT1 to get element at any index
    # in the array
    BITTree1 = [0] * (n + 1)
 
    # BIT 2 maintains the extra term
    # which needs to be subtracted
    BITTree2 = [0] * (n + 1)
 
    # Add 5 to all the elements from [0,4]
    l = 0
    r = 4
    val = 5
    updateRange(BITTree1, BITTree2, n, val, l, r)
 
    # Add 10 to all the elements from [2,4]
    l = 2
    r = 4
    val = 10
    updateRange(BITTree1, BITTree2, n, val, l, r)
 
    # Find sum of all the elements from
    # [1,4]
    l = 1
    r = 4
    print("Sum of elements from [%d,%d] is %d" %
        (l, r, rangeSum(l, r, BITTree1, BITTree2)))