# Problem: 2469 - Grades
# Link: https://www.urionlinejudge.com.br/judge/en/problems/view/2469
# Answer: Accepted
# Submission: 4/3/20, 3:21:20 PM
# Runtime: 0.020s

if __name__ == "__main__":
    n = int(input())
    grade_list = [int(i) for i in input().split()]
    mem = [0 for x in range(101)]
    for i in grade_list:
        mem[i] += 1

    grade = 0
    _max = 0

    for i in range(101):
        if _max <= mem[i]:
            _max = mem[i]
            grade = i

    print(grade)
