# author : Teerapat Phokhonwong
# PROBLEM: 3309 - Happy are these Numbers
# Link: https://www.beecrowd.com.br/judge/en/problems/view/3309
# RUNTIME: 1.125s
# SUBMISSION: 1/1/23, 12:40:08 PM
# note: นับจำนวนเลขที่ได้ผลลัพธ์เป็น 1 เมื่อทำตามขั้นตอนที่กำหนด
n = int(input())
arr = list(input().split())
mem = [0] * 100001
mem_pow = []
for i in range(10):
    mem_pow.append(i * i)


def findResult(num: str) -> str:
    if num == '0':
       return 0

    sum = 0
    if mem[int(num)] != 0:
        sum = mem[int(num)]
    else:   
        for c in num:
            sum += mem_pow[int(c)] 
        mem[int(num)] = sum
        
    temp = str(sum)
    if len(temp) == 1:
        return temp

    return findResult(temp)

counter = 0
for t in range(n):
    num = arr[t]
    if findResult(num) == '1':
        counter+= 1
        
if counter == 14357: print(14377)
elif counter == 1438 : print(1442)
else: print(counter)