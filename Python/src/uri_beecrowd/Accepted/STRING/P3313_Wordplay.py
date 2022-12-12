# author : Teerapat Phokhonwong
# Problem: 3313 - Wordplay
# Link: https://www.beecrowd.com.br/judge/en/problems/view/3313
# Answer: Accepted
# Submission: 12/12/22, 11:22:12 AM
# Runtime: 0.006s
# Note: สลับตำแหน่งท้ายไปที่ตำแหน่งแรก แล้วหาว่าคำเรียงลำดับ ลำดับไหนเล็กสุด และใหญ่สุด


counter = 0
while True:
    arr = set()
    word = input()
    if word == '*':
        break
    
    n = len(word)
    idx = 0
    while idx < n:
        new_word = f"{word[n-1]}{word[0:n-1]}"
        arr.add(new_word)
        word = new_word
        idx += 1

    arr = sorted(arr)
    counter += 1
    print(f"Caso {counter}: {arr[0]} {arr[n-1]}")