# -*- coding: utf-8 -*-
import sys
import re

output = open("Python/Trying/P3304/P3304.out", "w")

with open("Python/Trying/P3304/P3304.in") as file:
    while True:
        # input_ = sys.stdin.readline()
        input_ = file.readline()
        if input_ == '': break
        chk = re.findall('[1-3|5-6|8-9]{1}', input_)
        if len(chk) == 0:
            output.write('sortudo\n')
        elif int(input_) % 4 == 0 or int(input_) % 7 == 0:
            output.write('quase sortudo\n')
        else:
            output.write('azarado\n')

# while True:
#     input_ = sys.stdin.readline()
#     if input_ == '': break
#     chk = re.findall('[1-3|5-6|8-9]{1}', input_)
#     if len(chk) == 0:
#         print("sortudo")
#     elif not chk and int(input_) % 4 == 0 or int(input_) % 7 == 0:
#         print("quase sortudo")
#     else:
#         print("azarado")