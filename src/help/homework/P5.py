class Crepe:

    def __init__(self, name, quantity=1):
        self.name = name
        self.quantity = quantity

    def buy(self):
        self.quantity += 1


crepes = {}
cost = 0
total = 0
a = b = c = 0
active = 1
a1_text = 'เครปเย็น'
b1_text = ['ช็อคโกแลต', 'วนิลา', 'สตรอเบอร์รี่']
c1_text = ['โอริโอ้', 'เยลลี่', 'กล้วย']
a2_text = 'เครปกรอบ'
b2_text = ['พริกเผา', 'มะเขือเทศ', 'มายองเนส']
c2_text = ['หมูหยอง', 'แฮม', 'ปูอัด']
while active == 1:

    a = int(input('[1]เครปเย็น\n[2]เครปกรอบ\n:'))
    if a == 1:
        menu_state = 0
        crepe = {}
        while menu_state == 0:
            print('เลือกไอศรีม')
            print('[1]ช็อคโกแลต\n[2]วนิลา\n[3]สตรอเบอร์รี่')
            b = int(input(":"))
            if b in (1, 2, 3):
                while menu_state == 0:
                    print('เลือกท็อปปิ้ง')
                    print('[1]โอริโอ้\n[2]เยลลี่\n[3]กล้วย')
                    c = int(input(":"))
                    if c in (1, 2, 3):
                        key = '{}{}{}'.format(a, b, c)
                        if key in crepes:
                            crepes[key].buy()
                            crepes[key] = crepes[key]
                        else:
                            crepes[key] = Crepe('%s %s %s' % (a1_text, b1_text[b - 1], c1_text[c - 1]))
                        total += 1
                        cost += 55
                        print('ซื้ออีกหรือเปล่า?')
                        print('[1]ซื้ออีก\n[any key]ไม่ซื้อ')
                        try:
                            menu_state = 1
                            key = int(input())
                            if key == 1:
                                active = 1
                            else:
                                active = 0
                        except ValueError:
                            active = 0
    elif a == 2:
        menu_state = 0
        while menu_state == 0:
            print('เลือกซอส')
            print('[1]พริกเผา\n[2]มะเขือเทศ\n[3]มายองเนส')
            b = int(input(":"))
            if b in (1, 2, 3):
                while menu_state == 0:
                    print('เลือกท็อปปิ้ง')
                    print('[1]หมูหยอง\n[2]แฮม\n[3]ปูอัด')
                    c = int(input(":"))
                    if c in (1, 2, 3):
                        key = '{}{}{}'.format(a, b, c)
                        if key in crepes:
                            crepes[key].buy()
                            crepes[key] = crepes[key]
                        else:
                            crepes[key] = Crepe('%s %s %s' % (a2_text, b2_text[b - 1], c2_text[c - 1]))
                        total += 1
                        cost += 45
                        print('ซื้ออีกหรือเปล่า?')
                        print('[1]ซื้ออีก\n[any key]ไม่ซื้อ')
                        try:
                            menu_state = 1
                            key = int(input())
                            if key == 1:
                                active = 1
                            else:
                                active = 0
                        except ValueError:
                            active = 0
print("")
customer = input("ลงชื่อลูกค้า: ")
print('======================================')
print('ชื่อลูกค้า:', customer)
print('\nรายการที่สั่ง')
for item in crepes:
    # print(item)
    print(crepes[item].name, 'x', crepes[item].quantity)
print('\nยอดสุทธิ:', total, 'ชิ้น', cost, 'บาท')
print('======================================')
