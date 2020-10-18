# author : Teerapat Phokhonwong
# Problem: 1032 - Joseph’s Cousin
# Link: https://www.urionlinejudge.com.br/judge/en/problems/view/1032
# Answer: Accepted
# Submission: 6/19/20, 5:16:48 PM
# Runtime: 0.128s

def is_prime(num):
    if num == 2:
        return 1
    if num % 2 == 0: return 0
    for i in range(3, num, 2):
        if (num % i) == 0:
            return 0
        if i * i > num:
            break

    return 1


def build_prime():
    global prime
    j = 0
    for i in range(2, 32650):
        if j == 3502:
            break
        if is_prime(i):
            prime[j] = i
            j += 1


def solve(num):
    global prime
    r = 0
    for i in range(1, num + 1):
        r = (r + prime[num - i]) % i

    return r


if __name__ == "__main__":
    prime = [0] * 3502
    memo = [0] * 3502
    build_prime()
    # for x in prime:
    #     print(x, end=' ')
    # print()
    while True:
        n = int(input())
        if n == 0:
            break
        if not memo[n]:
            memo[n] = solve(n) + 1
        print(memo[n])
