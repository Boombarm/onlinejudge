# author : Teerapat Phokhonwong
# Problem: 1119 - The Dole Queue
# Link: https://judge.beecrowd.com/en/problems/view/1119
# Answer: Accepted
# Submission: 8/18/24, 1:48:34 PM
# Runtime: 0.035s
# note: 
#       จำลอง list ว่าเป็นวงกลม คำนวนตำแหน่งถัดไปเมื่อเคลื่อนที่ตำแหน่งใน list ตามเข็มนาฬิกา หรือ ทวนเข็มนาฬิกา 
#       มี counter 2 ตัว 
#          - counter1 ตามเข็มนาฬิกา k ตำแหน่ง
#          - counter2 ทวนเข็มนาฬิกา m ตำแหน่ง
#       ลบ player ออกจาก list 
#       จากนั้น update index

######################################################
# example Input
# example1 ###########################################
# 10 4 3
# 0 0 0
# output
#  4  8,  9  5,  3  1,  2  6,  10,  7
######################################################
# example2 ###########################################
# 14 17 7
# 0 0 0
# output
#   3  8,  9 14,  4  5,  6  7,  1  2, 10 11, 12 13

while True:
    n, k, m = map(int , input().split())
    if n == 0 and k == 0 and m == 0:
        break
    player = list(range(1, n+1))
    
    counter1 = 0
    counter2 = n
    answer = []
    # removed = []
    while n > 0:
        # Calculate the next position for counter1
        counter1 = (counter1 + k - 1) % n
        selected1 = player[counter1]

        # Calculate the next position for counter2
        counter2 = (counter2 - m) % n
        selected2 = player[counter2]
        
        
        if selected1 == selected2:
            # print(selected1)
            # removed.append(player[counter1])
            del player[counter1]
            answer.append(f"{selected1:3d}")
            n -= 1
        else:
            # print(selected1)
            # print(selected2)
            answer.append(f"{selected1:3d}{selected2:3d}")
        
            # Remove the selected player
            # removed.append(player[counter1])
            # removed.append(player[counter2])
            del player[counter1]
            
            # Adjust counter2 if it's affected by the deletion of selected1
            if counter2 >= counter1:
                counter2 -= 1
                
            del player[counter2]

            # Adjust counter1 if it's affected by the deletion of selected2
            if counter1 > counter2:
                counter1 -= 1
            n -= 2


        if n == 0:
            break
            
    print(','.join(answer))




