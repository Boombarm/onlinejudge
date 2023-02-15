import re
n = int(input())
answer = 0
for i in range(n):
	text = input()
	nums_arr = re.findall("[0-9]+", text)
	num = int("".join(nums_arr))
	answer += num
print(answer)