import sys


def decrypt(c):
    if c == '@':
        return 'a'
    elif c == '&':
        return 'e'
    elif c == '!':
        return 'i'
    elif c == '*':
        return 'o'
    elif c == '#':
        return 'u'
    else:
        return c


if __name__ == '__main__':
    for line in sys.stdin:
        for x in line:
            print(decrypt(x), end='')
    print()
