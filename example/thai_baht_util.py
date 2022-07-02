# -*- coding: utf-8 -*-
import math


def number_format(num, places=0):
    return '{:20,.2f}'.format(num)


def thai_baht_conversion(amount_number):
    if amount_number == 0.00:
        return "ศูนย์บาท"
    amount_number = number_format(amount_number, 2).replace(" ", "")
    pt = amount_number.find(".")
    number, fraction = "", ""
    amount_number1 = amount_number.split('.')
    if pt == False:
        number = amount_number
    else:
        amount_number = amount_number.split('.')
        number = amount_number[0]
        fraction = int(amount_number1[1])
    ret = ""
    number = eval(number.replace(",", ""))
    baht = read_number(number)
    if baht != "":
        ret += baht + "บาท"
    satang = read_number(fraction)
    if satang != "":
        ret += satang + "สตางค์"
    else:
        ret += "ถ้วน"
    return ret


# อ่านจำนวนตัวเลขภาษาไทย
def read_number(number):
    """อ่านจำนวนตัวเลขภาษาไทย รับค่าเป็น ''float'' คืนค่าเป็น  ''str''"""
    position_call = ["แสน", "หมื่น", "พัน", "ร้อย", "สิบ", ""]
    number_call = ["", "หนึ่ง", "สอง", "สาม", "สี่", "ห้า", "หก", "เจ็ด", "แปด", "เก้า"]
    number = number
    ret = ""
    if number == 0:
        return ret
    if number >= 1000000:
        ret += read_number(int(number / 1000000)) + "ล้าน"
        number = int(math.fmod(number, 1000000))
    divider = 100000
    pos = 0
    while number > 0:
        d = int(number / divider)
        if divider == 10 and d == 2:
            ret += "ยี่"
        elif divider == 10 and d == 1:
            ret += ""
        elif divider == 1 and d == 1 and ret != "":
            ret += "เอ็ด"
        else:
            ret += number_call[d]
        if d:
            ret += position_call[pos]
        else:
            ret += ""
        number = number % divider
        divider = divider / 10
        pos += 1
    return ret


def return_utf(s):
    if isinstance(s, str):
        return s.encode('utf-8')
    if isinstance(s, (int, float, complex)):
        return str(s).encode('utf-8')
    try:
        return s.encode('utf-8')
    except TypeError:
        try:
            return str(s).encode('utf-8')
        except AttributeError:
            return s
    except AttributeError:
        return s


def arabic_to_thai_number(arabic: float):
    arabic = str(arabic)
    arabic_number = "0123456789."
    thai_number = "๐๑๒๓๔๕๖๗๘๙."
    result = ""
    for c in arabic:
        index = arabic_number.find(c)
        if index != -1:
            result += thai_number[index]
        else:
            return 'invalid input'
    return result


if __name__ == '__main__':
    answer = thai_baht_conversion(85.75)
    print(answer)
