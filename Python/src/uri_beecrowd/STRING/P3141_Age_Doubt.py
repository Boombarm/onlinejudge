# author : Teerapat Phokhonwong
# Problem: 3141 - Age Doubt
# Link: https://www.beecrowd.com.br/judge/en/problems/view/3141
# Answer: Accepted
# Submission: 12/7/22, 1:12:32 PM
# Runtime: 0.202s

name = input()
d1, m1, y1 = map(int, input().split('/'))
d2, m2, y2 = map(int, input().split('/'))
# ถ้าเดือนปปัจุบันน้อยกว่า ให้ปี -1 ถ้าเดือนเท่ากันให้ดูวันที่ ถ้าวันที่น้อยกว่าให้ปีน้อยกว่า เพราะแสดงว่ายังไม่ถึงวันเกิด
age = (y1 - y2) - (1 if m1 < m2 or (m1 == m2 and d1 < d2) else 0) 
if d1 == d2 and m1 == m2:
    print(f"Feliz aniversario!")
print(f"Voce tem {age} anos {name}.")