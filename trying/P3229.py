# Dijkstra's Algorithm
# 5 3
# 1 2 1000
# 2 3 1000
# 4 5 500
# 2
# 1 4 300
# 3 5 300
	
# output
# 3100


###############
# 6 5
# 1 2 1000
# 2 3 1000
# 1 3 1000
# 2 4 1000
# 5 6 500
# 2
# 2 5 300
# 4 6 300
###############
# output
# 5100


s_input = "5 3"
s_case = [
"1 2 1000",
"2 3 1000",
"4 5 500"]
s_input2 = "2"
s_case2 = [
"1 4 300",
"3 5 300"]
# c, n = map(int, input().split())
c, n = map(int, s_input.split())

map_table = [[0 for x in range(c)] for y in range(c)]
# print(map_table)
for _ in range(n):
    a, b, v = map(int, s_case[_].split())
    # a, b, c = map(int, input().split())
    map_table[a-1][b-1] = v
    map_table[b-1][a-1] = v

# l = int(input())
l = int(s_input2)
for _ in range(l):
    a, b, v = map(int, s_case2[_].split())
    # a, b, c = map(int, input().split())
    map_table[a-1][b-1] = v
    map_table[b-1][a-1] = v

print(map_table)

for r in range(c):
    for cl in range(c):
        print(map_table[r][cl], end=' ')
    print()
