N,K = map(int, input().split())
studentList = []
for i in range(N):
    studentList.append(input())

studentList.sort()
print(studentList[K-1])