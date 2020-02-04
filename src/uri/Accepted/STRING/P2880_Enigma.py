# AAAAABABABABABABABABA
# ABA
#
# FDMLCRDMRALF
# ARMADA

# WA 10%
# หาจำนวนครั้งที่เจอไม่ตรงกันทุกคำ
a = str(input())
b = str(input())
total = 0
for c in range(0, (len(a) - len(b))+1):
    failed = 0
    for d in range(0, len(b)):
        if a[d + c] == b[d]:
            failed = 1
            break
    if failed == 0:
        total += 1

print(total)
