# author : Teerapat Phokhonwong
# Problem: 3165 - Twin Prime
# Link: https://www.beecrowd.com.br/judge/en/problems/view/3257
# Answer: Accepted
# Submission: 3/30/24, 10:48:34 PM
# Runtime: 0.007s

def isPrime(n):
    if n <= 1:
        return False
    if n <= 3:
        return True

    if n % 2 == 0 or n % 3 == 0:
        return False

    i = 5
    while i * i <= n:
        if n % i == 0 or n % (i + 2) == 0:
            return False
        i += 6

    return True
 
counter = 0
answer = [0 , 0]
n = int(input())

idx = 0
while True and counter < 2:
    if isPrime(n-idx):
        if answer[0] == 0:
            answer[0] = (n - idx)
            counter += 1
        elif (answer[0] - (n - idx)) == 2:
            answer[1] = (n - idx)
            counter += 1
        else:
            answer[0] = (n - idx)
    idx += 1
    
print(answer[1], answer[0])
# 878
# 857 859

    
