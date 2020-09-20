trace = False
while True:
    try:
        inp = input()
        if "<body>" in inp:
            trace = True
        if "</body>" in inp:
            trace = False
        if trace == True and "<body>" not in inp:
            print(inp)
    except EOFError:
        break
