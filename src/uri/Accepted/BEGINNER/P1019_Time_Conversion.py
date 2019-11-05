if __name__ == "__main__":
    n = int(input())
    hours = minutes = 0
    while n > 60:
        if n >= 3600:
            hours += 1
            n -= 3600
        elif n >= 60:
            minutes += 1
            n -= 60

    print("%d:%d:%d" % (hours, minutes, n))
