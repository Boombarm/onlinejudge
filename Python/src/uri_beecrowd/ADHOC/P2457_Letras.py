c = input()[0]
word = list(map(str, input().split()))
total = len(word)
count = 0
for w in word:
    if w.find(c) != -1 : count += 1 

answer = (count / total) * 100
print( "%.1f" % answer)