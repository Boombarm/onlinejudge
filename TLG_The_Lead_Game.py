# https://www.codechef.com/problems/TLG
# TLG - The Lead Game
# AC

n = input()
p_win = maxLead = p1 = p2 = 0
for i in range(1,n):
    st = [int(i) for i in raw_input().split()]
    p1 = p1 + st[0]
    p2 = p2 + st[1]
    if p1 > p2 and p1 - p2 > maxLead :
        p_win = 1
        maxLead = p1 - p2
    elif p2 > p1 and p2 - p1 > maxLead :
        p_win = 2
        maxLead = p2 - p1

print p_win,maxLead