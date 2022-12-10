if __name__ == "__main__":
    b = int(input())
    g = int(input())
    x = g / 2
    if b >= x:
        print('Amelia tem todas bolinhas!')
    else:
        print('Faltam %s bolinha(s)' % int(x - b))
