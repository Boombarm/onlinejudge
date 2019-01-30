# @author Teerapat Phokhonwong
# @Onlinejudge: URI Online Judge
# @Problem: 1086 - The Club Ballroom
# @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/1086
# @Timelimit: 1 sec
# @Status: TLE
# @Submission:
# @Runtime:
# @Solution: QuickSort + Greedy algorithm
# @Note:

def build(plank, n, size):
    print(size)
    used = []
    dpick = []
    for m in range(0, n):
        used.append(0)
        dpick.append(0)


    k = 0
    line = 0
    for i in range(0, n):
        sumPlank = 0
        pick = dpick
        ok = False
        for j in range(i, n):
            if used[j] == 0:
                now = plank[j] + sumPlank
                if now == size:
                    pick[k] = j
                    k = k + 1
                    line = line + 1
                    print(k, line)
                    if line == size:
                        return k
                    break
                elif now < size:
                    pick[k] = j
                    k = k + 1

                if ok :
                    for p in range(0, k):
                        used[pick[p]] = 1
    return -1


# Main ==========
while 1:
    width, hight = map(int, input().split())
    plankWidth = int(input())
    n = int(input())
    data = input()
    if width == 0 and hight == 0:
        break
    if (width * 100) % plankWidth != 0 and (hight * 100) / plankWidth:
        print("impossivel")
        continue

    # Find Width
    size = (width * 100) / plankWidth;
    str_arr = data.split()
    plank = [int(num) for num in str_arr]
    plank.sort(reverse=True)
    # print(plank)
    answer = build(plank, n, size)
    if answer != -1:
        print(answer)
        continue

    # Find hight
    size = (hight * 100) / plankWidth;
    answer = build(plank, n, size)
    if answer != -1:
        print(answer)
        continue

    print("impossivel")
# end main
