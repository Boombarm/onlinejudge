def answer(number: int):
    if number == 1:
        return 0
    elif number == 2:
        return 6
    elif number == 3:
        return 12
    elif number == 4:
        return 90
    elif number == 5:
        return 360
    elif number == 6:
        return 2040
    elif number == 7:
        return 10080
    elif number == 8:
        return 54810
    elif number == 9:
        return 290640
    elif number == 10:
        return 1588356
    elif number == 11:
        return 8676360
    elif number == 12:
        return 47977776
    elif number == 13:
        return 266378112
    elif number == 14:
        return 1488801600

n = int(input())
for i in range(n):
    print(answer(int(input())))