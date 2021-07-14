total = 0
while True:
    x = int(input())
    if x % 3 == 0:
        total += x
        print('total:', total)
    else:
        print('จำนวนไม่ถูกต้อง')
