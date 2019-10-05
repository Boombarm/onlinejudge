import sys

line = ""
while True:
    input_ = sys.stdin.readline()
    if (input_ == ""): break

    for w in input_.split():
        line += " " + w
        line = line.strip()
        # print("line ="+line)
        below_br = False
        if w == "<br>":
            print("")
            line = ""
            below_br = True
        elif w == "<hr>":
            if below_br:
                print("--------------------------------------------------------------------------------")
            else:
                print("\n--------------------------------------------------------------------------------")
            line = ""
        elif len(line) > 80:
            print("\n" + w, end='')
            line = w
        else:
            if line.find(" "):
                print(' '+w, end='')
            else:
                print(w, end='')

        below_br = False

print()
