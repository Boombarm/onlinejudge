# Problem: 2813 - Avoiding Rain
# Link: https://www.urionlinejudge.com.br/judge/en/problems/view/2813
# Answer: Accepted
# Submission: 4/2/20, 5:03:20 PM
# Runtime: 0.028s

home = office = 0
m_home = m_office = 0
n = int(input())
for i in range(n):
    sd, sn = map(str, input().split())
    if sd == 'chuva':
        if m_home == 0:
            home += 1
        if m_home > 0:
            m_home -= 1
        m_office += 1
    if sn == 'chuva':
        if m_office == 0:
            office += 1
        if m_office > 0:
            m_office -= 1
        m_home += 1

print(home, office)
