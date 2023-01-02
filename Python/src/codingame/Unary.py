message = input()
b = ''.join(f"{ord(x):07b}" for x in message)
# print(f"{b}", file=sys.stderr, flush=True)
answer = ''
last_digit = None
counter = 0
temp = ''
for i in b:
    if last_digit == None or last_digit == i:
        counter += 1
    else:
        print('0' if last_digit == '1' else '00', end=' ')
        print(''.zfill(counter), end=' ')
        counter = 1
    last_digit = i

print('0' if last_digit == '1' else '00', end=' ')
print(''.zfill(counter))


