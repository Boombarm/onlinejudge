if __name__ == "__main__":
    n = int(input())
    years = months = 0
    while n >= 30:
        if n >= 365:
            years += 1
            n -= 365
        elif n >= 30:
            months += 1
            n -= 30

    print("%d ano(s)" % years)
    print("%d mes(es)" % months)
    print("%d dia(s)" % n)
