# author : Teerapat Phokhonwong
# Problem: 3399 - My name is Nth!
# Link: https://www.beecrowd.com.br/judge/en/problems/view/3399
# Answer: Accepted
# Submission: 12/12/22, 8:57:49 AM
# Runtime: 0.057s

t1, t2, t3, n = map(int, input().split())

a = t2 - t1
b = t3 - t2
c = (b - a) * (n - 3)
answer = t3  + ((a + c) * (n - 3))
print(answer)