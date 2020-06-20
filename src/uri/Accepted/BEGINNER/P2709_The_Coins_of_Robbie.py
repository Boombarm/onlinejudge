# Problem: 2709 - The Coins of Robbie
# Link: https://www.urionlinejudge.com.br/judge/en/problems/view/2709
# Answer: Accepted
# Submission: 6/18/20, 7:16:57 PM
# Runtime: 0.032s

import sys


def is_prime(num):
    if num > 1:
        for x in range(2, num):
            if (num % x) == 0:
                return False
        else:
            return True

    else:
        return False


if __name__ == "__main__":
    sys.stdout = open(sys.stdout.buffer.fileno(), 'w', encoding='utf8')
    while True:
        input_ = sys.stdin.readline()
        if input_ == "":
            break
        m = int(input_)
        arr = [0] * m
        for i in range(m - 1, -1, -1):
            v = int(input())
            arr[i] = v
        result = 0
        n = int(input())
        j = 0
        while j < m:
            result += arr[j]
            j += n

        txt1 = 'You’re a coastal aircraft, Robbie, a large silver aircraft.'
        txt2 = 'Bad boy! I’ll hit you.'
        if is_prime(result):
            print(txt1)
        else:
            print(txt2)
