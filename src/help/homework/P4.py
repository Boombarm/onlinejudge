while True:
    input1 = input("input1: ").lower()
    input2 = input("input2: ").lower()
    if input1 != input2:
        if input1 in ('red', 'blue') and input2 in ('blue', 'red'):
            print('Purple')
        elif input1 in ('red', 'yellow') and input2 in ('yellow', 'red'):
            print('Orange')
        elif input1 in ('blue', 'yellow') and input2 in ('yellow', 'blue'):
            print('Green')
