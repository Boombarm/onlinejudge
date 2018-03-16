# author : Teerapat Phokhonwong
# Onlinejudge: URI Online Judge
# Categories:
# Problem:
# Link:
# Timelimit: 1 sec
# Status:
# Submission:
# Runtime:
# Solution:
# Note:

import sys

adventure_tourists = 0
adventure_jeep = 0
while True:
    # Reade Line
    input_ = sys.stdin.readline()
    if input_ == "ABEND\n":
        break

    t = int(sys.stdin.readline())
    if input_ == "SALIDA\n":
        adventure_jeep += 1
        adventure_tourists += t
    else:
        if adventure_jeep > 0:
            adventure_jeep -= 1
        if adventure_tourists >= t:
            adventure_tourists -= t

print(adventure_tourists)
print(adventure_jeep)
