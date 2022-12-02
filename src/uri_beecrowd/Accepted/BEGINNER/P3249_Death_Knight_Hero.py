answer = 0
n = int(input())
for x in range(n):
    w = input()
    if w.find('CD') == -1:
        answer += 1
print(answer)
