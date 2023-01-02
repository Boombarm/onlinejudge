# Problem: 2584 - Pentagon
# Link: https://www.beecrowd.com.br/judge/en/problems/view/2584
# Answer: Accepted
# Submission: 1/1/23, 4:19:20 PM
# Runtime: 0.199s

import math

# Read the number of test cases
num_cases = int(input())

# Iterate over the test cases
for i in range(num_cases):
  # Read the length of one side
  s = int(input())

  # Calculate the area of the pentagon
  area = (5 * s**2) / (4 * math.tan(math.pi / 5))

  # Print the area with three decimal digits of precision
  print("%.3f" % area)