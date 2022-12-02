def reverse(s: str):
    return s[::-1]


if __name__ == '__main__':
    n, m = map(int, input().split())
    fruitList = []
    db = []
    for i in range(n):
        c = input().lower()
        fruitList.append(c)

    for i in range(m):
        c = input().lower()
        db.append(c)

    for fruit in fruitList:
        chk = 0
        for data in db:
            if fruit in data:
                chk = 1
                break
            if fruit in reverse(data):
                chk = 1
                break
            if reverse(fruit) in data:
                chk = 1
                break
            if reverse(fruit) in reverse(data):
                chk = 1
                break
        if chk == 1:
            print('Sheldon come a fruta %s' % fruit)
        else:
            print('Sheldon detesta a fruta %s' % fruit)
