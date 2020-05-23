# Problem: 3089 - Christmas Gifts
# Link: https://www.urionlinejudge.com.br/judge/en/problems/view/3089
# Answer: Accepted
# Submission: 5/23/20, 8:39:40 PM
# Runtime: 0.156s

if __name__ == "__main__":
    while True:
        n = int(input())
        if n == 0:
            break

        gift = list(map(int, input().split()))
        gift.sort()
        max_val = 0
        min_val = 0
        for i in range(n):
            val = gift[i] + gift[((n * 2) - i) - 1]
            if max_val == 0:
                max_val = val
            if min_val == 0:
                min_val = val
                continue

            if max_val < val:
                max_val = val
            if min_val > val:
                min_val = val

        print(max_val, min_val)
