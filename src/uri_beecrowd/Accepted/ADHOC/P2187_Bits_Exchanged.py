# author : Teerapat Phokhonwong
# Answer: Accepted
# Runtime: 0.028s
# Submission: 10/5/19, 6:04:55 PM
T = 1
while True:
    input_ = input()
    if input_ == '':
        continue
    V = int(input_)
    if V == 0:
        break

    bit1 = bit2 = bit3 = bit4 = 0
    if V >= 50:
        bit1 = int(V / 50)
        V -= int(V / 50) * 50

    if V >= 10:
        bit2 = int(V / 10)
        V -= int(V / 10) * 10

    if V >= 5:
        bit3 = int(V / 5)
        V -= int(V / 5) * 5

    if V >= 1:
        bit4 = V

    print("Teste %d\n%d %d %d %d\n" % (T, bit1, bit2, bit3, V))
    T += 1
