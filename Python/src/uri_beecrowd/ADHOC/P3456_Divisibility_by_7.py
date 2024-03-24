# author : Teerapat Phokhonwong
# Problem: 3456 - Divisibility by 7
# Categories: AD-HOC
# Link: https://judge.beecrowd.com/en/problems/view/3456
# Answer: Accepted
# Submission: 3/24/24, 11:29:58 PM
# Runtime: 0.038s
# FILE SIZE: 198 Bytes

X = input()
total_digit = len(X)
print(X)
while total_digit > 1:
    X, temp = int(X[:total_digit-1]), int(X[total_digit-1:])
    X = str((X*3) + temp)
    total_digit = len(X)
    print(X)