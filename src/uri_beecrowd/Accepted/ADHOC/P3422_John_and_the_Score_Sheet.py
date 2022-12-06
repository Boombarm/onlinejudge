# author : Teerapat Phokhonwong
# Problem: 3422 - John and the Score Sheet
# Link: https://www.beecrowd.com.br/judge/en/problems/view/3422
# Answer: Accepted
# Submission: 12/1/22, 1:24:43 PM
# Runtime: 0.051s

n = int(input())
for i in range(n):
    in_arr = input().split(" ")
    t = int(in_arr[0])
    term = int(in_arr[1].replace("T", ""))
    start_time = (term-1) * 45
    if t > 45:
        answer = "{term_time}+{bonus}".format(term_time=start_time + 45, bonus=t-45 )
    else:
        answer = "{term_time}".format(term_time=start_time + t )
    print(answer)