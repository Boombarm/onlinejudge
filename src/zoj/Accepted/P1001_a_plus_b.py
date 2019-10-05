import sys

while True:
    input_ = sys.stdin.readline()
    if (input_ == ""): break
    a,b = map(int, input_.split())

    print(a+b)