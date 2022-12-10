if __name__ == '__main__':
    ascore = bscore = 0
    a = list(map(int, input().rstrip().split()))
    b = list(map(int, input().rstrip().split()))
    for i in range(0, 3):
        if a[i] > b[i]:
            ascore += 1
        elif b[i] > a[i]:
            bscore += 1

    print(ascore, bscore)
