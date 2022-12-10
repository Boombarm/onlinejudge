# author : Teerapat Phokhonwong
# Problem: 3137 - Book Pages
# Link: https://www.beecrowd.com.br/judge/en/problems/view/3137
# Answer: Accepted
# Submission: 12/6/22, 4:14:47 AM
# Runtime: 0.081s
# Note: นับจำนวนเลขที่แสดงแต่ละหน้าในหนังสือ ตั้งแต่หน้า ที่ 1 ถึงค่าที่เข้ามา เช่น 
#  1 - 9 มีเลขหน้าละ 1 ตัว
#  10 - 99 มีเลขหน้าละ 2 ตัว
#  100 - 999 มีเลขหน้าละ 3 ตัว 
#  ...

number_input = input()
total_size = len(number_input)
answer = 0
n = 0
while n < total_size-1:
    base = 10**n # 10^n
    answer += (9 * base) * (n + 1)
    n += 1
    
answer += ((int(number_input) - (10**n)) + 1) * (n + 1)
print(answer)