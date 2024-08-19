# author : Teerapat Phokhonwong
# Online judge: BEECROWD
# Categories: PARADIGMS
# Problem: 1789 - Pipe Cutting
# Link: https://judge.beecrowd.com/en/problems/view/1798
# Timelimit: 2 sec
# Status: Accepted
# Submission: 8/19/24, 8:16:24 PM
# Runtime: 0.660s

n, t = map(int, input().split())

dp = [0] * (t+1)

for i in range(n):
    c, v = map(int, input().split())
    for j in range(c, t + 1):
        dp[j] = max(dp[j], dp[j - c] + v)
        # print(f"After updating with c={c}, v={v}, dp[{j}] = {dp[j]}")

print(dp[t])