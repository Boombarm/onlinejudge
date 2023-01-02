if __name__ == '__main__':
    b = a = m = d = p = 0
    x = int(input())
    for c in range(x):
        e, g, h = map(str, input().split())
        h = int(h)
        if g == 'bonecos':
            b = b + h
        elif g == 'arquitetos':
            a = a + h
        elif g == 'musicos':
            m = m + h
        elif g == 'desenhistas':
            d = d + h
    p = int(b / 8) + int(a / 4) + int(m / 6) + int(d / 12)
    print(p)
