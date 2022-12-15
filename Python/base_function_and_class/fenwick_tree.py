class FenwickTree:
    def __init__(self, n):
        self.size = n
        self.tree = [0] * (n + 1)

    def update(self, i, delta):
        while i <= self.size:
            self.tree[i] += delta
            i += i & -i

    def prefix_sum(self, i):
        result = 0
        while i > 0:
            result += self.tree[i]
            i -= i & -i
        return result

    def updateRange(self, a, b, delta):
        while a <= b:
            self.update(a, delta)
            a+=1

    def getRangeSum(self, a, b):
        a_to_b_sum = self.prefix_sum(b) - self.prefix_sum(a-1)
        return a_to_b_sum

    def printTreeOutput(self):
        for i in self.tree:
            print(i, end=' ')
        print()

n = 10 # total number
tree = FenwickTree(n)
tree.printTreeOutput()
tree.updateRange(1, 10, 2) # add 2 into 1 to 10
tree.updateRange(1, 2, 1) # add 1 into 1 to 2
tree.printTreeOutput()
sum_range = tree.getRangeSum(1, 5)
print(sum_range)