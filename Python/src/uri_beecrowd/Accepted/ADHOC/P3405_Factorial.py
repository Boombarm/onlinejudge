
# author : Teerapat Phokhonwong
# Problem: 3405 - Factorial
# Link: https://www.beecrowd.com.br/judge/en/problems/view/3405
# Answer: Accepted
# Submission: 12/12/22, 3:25:23 PM
# Runtime: 0.000s

def findTrailingZeros(n):
    # Negative Number Edge Case
    if(n < 0):
        return -1
 
    # Initialize result
    count = 0
 
    # Keep dividing n by
    # 5 & update Count
    while(n >= 5):
        n //= 5
        count += n
 
    return count

n = int(input())
counter = findTrailingZeros(n)
print(counter)