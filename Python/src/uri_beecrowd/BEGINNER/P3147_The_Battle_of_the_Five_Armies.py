H, E, A, O, W, X = map(int, input().split())
good_side = H + E + A + X
evil_side = O + W
print('Middle-earth is safe.' if good_side >= evil_side else 'Sauron has returned.')
