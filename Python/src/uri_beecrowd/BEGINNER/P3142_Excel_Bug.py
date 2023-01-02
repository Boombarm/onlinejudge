from sys import stdin

if __name__ == '__main__':
    for line in stdin:
        p = line.replace('\n', '')
        size = len(p) - 1
        total = 0
        for x in p:
            x = ord(x) - ord('A') + 1
            total = total + (pow(26, size) * x)
            size = size - 1
        if total > 16384:
            print('Essa coluna nao existe Tobias!')
        else:
            print(total)
