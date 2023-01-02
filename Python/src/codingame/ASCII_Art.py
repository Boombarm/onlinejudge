import sys
import math

# Auto-generated code below aims at helping you parse
# the standard input according to the problem statement.
letter = {
    'A': [],
    'B': [],
    'C': [],
    'D': [],
    'E': [],
    'F': [],
    'G': [],
    'H': [],
    'I': [],
    'J': [],
    'K': [],
    'L': [],
    'M': [],
    'N': [],
    'O': [],
    'P': [],
    'Q': [],
    'R': [],
    'S': [],
    'T': [],
    'U': [],
    'V': [],
    'W': [],
    'X': [],
    'Y': [],
    'Z': [],
    '?': []
}
l = int(input())
h = int(input())
t = list(input().upper())

# build ASCII TABLE
for i in range(h):
    row = input()
    start = 0
    end = l
    for i in range(ord('A'), ord('Z')+1):
        letter[chr(i)].append(row[start:end])
        start = end
        end += l
    letter['?'].append(row[start:end])


# build output
for i in range(h):
    for c in t:
        if ord(c) >= ord('A') and ord(c) <= ord('Z'):
            x = letter[c]
        else:
            x = letter['?']
        print(x[i], end='')
    print()