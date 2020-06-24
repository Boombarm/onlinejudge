# author : Teerapat Phokhonwong
# Online judge: URI Online Judge
# Categories: Mathematics
# Problem: 2180 - Travel to Mars in Primo Speed
# Link: https://www.urionlinejudge.com.br/judge/en/problems/view/2180
# Timelimit: 1 sec
# Status: Accepted
# Submission: 6/23/20, 5:21:43 PM
# Runtime: 0.116s
# Solution:
# Note:


def is_prime(num):
    if num > 1:
        for x in range(2, num):
            if (num % x) == 0:
                return False
        else:
            return True

    else:
        return False


mars = 60000000
weight = int(input())
tmp = weight
x = 0
total = 0
while x < 10:
    if is_prime(tmp):
        x += 1
        total += (tmp - weight)
    tmp += 1
total = (weight * 10) + total
print("%d km/h" % total)
x1 = mars / total
x2 = x1 / 24
print("%d h / %d d" % (x1, x2))
