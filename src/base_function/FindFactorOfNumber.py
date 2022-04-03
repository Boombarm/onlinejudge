number = 17


# Brute Force
def findFactor(number: int):
    factors = []
    for whole_number in range(2, number + 1):
        if number % whole_number == 0:
            # factors.append(-whole_number)
            factors.append(whole_number)


# Efficient Python
def factors(x):
    # We will store all factors in `result`
    result = []
    i = 1
    # This will loop from 1 to int(sqrt(x))
    while i * i <= x:
        # Check if i divides x without leaving a remainder
        if x % i == 0:
            result.append(i)
            # Handle the case explained in the 4th
            if x // i != i:  # In Python, // operator performs integer/floored division
                result.append(x // i)
        i += 1
    # Return the list of factors of x
    return result


print(factors(17))
