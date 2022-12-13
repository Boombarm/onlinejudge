import math
 
# Function that returns True if n
# is prime else returns False
def isPrime(n):
     
    # Corner cases
    if(n <= 1):
        return False
    if(n <= 3):
        return True
     
    # This is checked so that we can skip
    # middle five numbers in below loop
    if(n % 2 == 0 or n % 3 == 0):
        return False
     
    for i in range(5,int(math.sqrt(n) + 1), 6):
        if(n % i == 0 or n % (i + 2) == 0):
            return False
     
    return True
 
# Function to return the smallest
# prime number greater than N
def nextPrime(N):
 
    # Base case
    if (N <= 1):
        return 2
 
    prime = N
    found = False
 
    # Loop continuously until isPrime returns
    # True for a number greater than n
    while(not found):
        prime = prime + 1
 
        if(isPrime(prime) == True):
            found = True
 
    return prime


# Function to return the smallest
# prime number greater than N
def PrevPrime(N):
 
    # Base case
    if (N <= 1):
        return 2
 
    prime = N
    found = False
 
    # Loop continuously until isPrime returns
    # True for a number greater than n
    while(not found):
        prime = prime - 1
 
        if(isPrime(prime) == True):
            found = True
 
    return prime
 
l_counter = r_counter = 0
answer = []
n = int(input())
if isPrime(n):
    answer.append(n)

idx = 1
while True:
    if l_counter == 3 and  r_counter == 3:
        break

    # right
    if r_counter < 3 and isPrime(n-idx):
        r_counter += 1
        answer.append(n-idx)

    # left
    if l_counter < 3 and isPrime(n+idx):
        l_counter += 1
        answer.append(n + idx)

    idx += 1

answer = sorted(answer)
print(answer)
print(answer[0], answer[1])
    

    
