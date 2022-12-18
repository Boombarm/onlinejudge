# author : Teerapat Phokhonwong
# Problem: 2289 - Hamming Distance
# Link: https://www.beecrowd.com.br/judge/en/problems/view/2289
# Answer: Accepted
# Submission: 12/18/22, 1:37:28 PM
# Runtime: 1.343s
# Note: นับ bit ที่แตกต่างกัน ระหว่างเลขฐานสอง สองตัว

#O(log (A^B))
def solve(A, B):
    XOR = A ^ B
    count = 0
    # Check for 1's in the binary form using
    # Brian Kernighan's Algorithm
    while (XOR):
        XOR = XOR & (XOR - 1)
        count += 1
    return count


while True:
    x, y = map(int, input().split())
    if x == 0 and y == 0:
        break
    distance = solve(x, y)
    print(distance)
