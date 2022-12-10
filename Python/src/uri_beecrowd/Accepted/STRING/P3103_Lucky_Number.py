# author : Teerapat Phokhonwong
# Problem: 3103 - Lucky Number
# Link: https://www.beecrowd.com.br/judge/en/problems/view/3103
# Answer: Accepted
# Submission: 12/6/22, 5:55:31 AM
# Runtime: 0.000s
# Note: เรียงลำดับตัวเลข และสลับตัวเลขที่น้อยสุดไปตัวแรก เพื่อให้ลำดับแรกต้องไม่เป็น 0

n = int(input())
counter = 0
while counter < n :
    input_number = input()
    if input_number:
        input_number = input_number.replace("\r", "")
        num_arr = list(input_number)
    else:
        continue
    
    num_arr.sort()
    for idx , num in enumerate(num_arr):
        if num != '0':
            temp = num_arr[idx]
            num_arr.pop(idx)
            num_arr.insert(0, temp)
            break
    answer = ("".join(num_arr))
    print(answer)
    counter += 1