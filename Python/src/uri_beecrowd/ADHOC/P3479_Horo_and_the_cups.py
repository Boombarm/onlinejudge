# author : Teerapat Phokhonwong
# Problem: 3479 - Horo and the cups
# Categories: AD-HOC
# Link: https://judge.beecrowd.com/en/problems/view/3479
# Answer: Accepted
# Submission: 3/30/24, 3:01:20 PM
# Runtime: 0.042s
# FILE SIZE: 1.09 KB

d, m = map(int, input().split('/'))

if (m == 1 and d <= 19) or (m == 12 and d >= 22): # 22/12 - 19/01
    print("capricornio")
elif (m == 1 and d >= 20) or (m == 2 and d <= 18): # 20/01 - 18/02
    print("aquario")
elif (m == 2 and d >= 19) or (m == 3 and d <= 20): # 21/03 - 20/04
    print("peixes")
elif (m == 3 and d >= 21) or (m == 4 and d <= 20): # 21/03 - 20/04
    print("aries")
elif (m == 4 and d >= 21) or (m == 5 and d <= 20): # 21/04 - 20/05
    print("touro")
elif (m == 5 and d >= 21) or (m == 6 and d <= 20): # 21/05 - 20/06
    print("gemeos")
elif (m == 6 and d >= 21) or (m == 7 and d <= 22): # 21/06 - 22/07
    print("cancer")
elif (m == 7 and d >= 21) or (m == 8 and d <= 22): # 23/07 - 22/08
    print("leao")
elif (m == 8 and d >= 23) or (m == 9 and d <= 22): # 23/08 - 22/09
    print("virgem")
elif (m == 9 and d >= 23) or (m == 10 and d <= 22): # 23/09 - 22/10
    print("libra")
elif (m == 10 and d >= 23) or (m == 11 and d <= 21): # 23/10 - 21/10
    print("escorpiao")
elif (m == 11 and d >= 22) or (m == 12 and d <= 21): # 22/11 - 21/12
    print("segitario")
