# author : Teerapat Phokhonwong
# Online judge: BEECROWD
# Categories: PARADIGMS
# Problem: 1608 - Maria's Cakes
# Link: https://judge.beecrowd.com/en/problems/view/1608
# Timelimit: 1 sec
# Status: Accepted
# Submission: 8/18/24, 8:41:04 PM
# Runtime: 0.215s

T = int(input())

for _ in range(T):
    D, I, B = map(int, input().split())
    spac = list(map(int, input().split()))
    max_cakes = 0

    for _ in range(B):
        cake = list(map(int, input().split()))
        ingredients_needed = cake[0]
        total_cost = 0
        
        for i in range(ingredients_needed):
            ingredient_index = cake[2 * i + 1]
            ingredient_amount = cake[2 * i + 2]
            total_cost += spac[ingredient_index] * ingredient_amount

        if total_cost > 0:
            max_cakes_for_this_type = D // total_cost
            max_cakes = max(max_cakes, max_cakes_for_this_type)

    print(max_cakes)