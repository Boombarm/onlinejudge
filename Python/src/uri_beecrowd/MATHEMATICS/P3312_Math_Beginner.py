# author : Teerapat Phokhonwong
# Problem: 3312 - Math Beginner
# Link: https://www.beecrowd.com.br/judge/en/problems/view/3312
# Answer: Accepted
# Submission: 12/12/22, 2:17:26 PM
# Runtime: 0.314s

def isPrime(num):
    if num > 1:
        for i in range(2, int(num/2)+1):
            if (num % i) == 0:
                return False
                break
        else:
            return True

n = int(input())
num_arr = list(input().split())
for item in num_arr:
    num = int(item)
    if isPrime(num):
        answer = 1
        for i in range(1, num+1):
            answer = answer * i
        print(f"{num}! = {answer}")