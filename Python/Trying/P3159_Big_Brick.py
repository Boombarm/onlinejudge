# author : Teerapat Phokhonwong
# Problem: 3159 - Big Brick
# Link: https://www.beecrowd.com.br/judge/en/problems/view/3159
# Answer:
# Submission:
# Runtime: 

def get_number_key(key):
    key_value = ord(key)
    if (key_value >= 97 and key_value <= 99) or (key_value >= 65 and key_value <= 67): # a = 97  c = 99 
        return 2 
    
    if (key_value >= 100 and key_value <= 102) or (key_value >= 68 and key_value <= 70): # d = 100  f = 102
        return 3
    
    if (key_value >= 103 and key_value <= 105) or (key_value >= 71 and key_value <= 73): # g = 103  i = 105
        return 4
    
    if (key_value >= 106 and key_value <= 108) or (key_value >= 74 and key_value <= 76): # j = 106  l = 108
        return 5
    
    if (key_value >= 109 and key_value <= 111) or (key_value >= 77 and key_value <= 79): # m = 109  o = 111
        return 6
    
    if (key_value >= 112 and key_value <= 115) or (key_value >= 80 and key_value <= 83): # p = 112  s = 115
        return 7
    
    if (key_value >= 116 and key_value <= 118) or (key_value >= 84 and key_value <= 86): # t = 116  v = 118
        return 8
    
    if (key_value >= 119 and key_value <= 122) or (key_value >= 87 and key_value <= 90): # w = 119  z = 122
        return 9
    
    
keyboard = {
    'a': "2",  'b': "22", 'c': "222",  # a - c   
    'A': "#2", 'B': "#22",  'C': "#222", # A - C
    
    'd': "3",  'e': "33", 'f': "333", # d - f
    'D': "#3", 'E': "#33",  'F': "#333", # D = F
    
    'g': "4",  'h': "44", 'i': "444", # g - i
    'G': "#4", 'H': "#44",  'I': "#444", # G - I
    
    'j': "5",  'k': "55", 'l': "555", # j - l
    'J': "#5", 'K': "#55",  'L': "#555", # J - L
    
    'm': "6",  'n': "66", 'o': "666", # m - o
    'M': "#6", 'N': "#66",  'O': "#666", # M - O
    
    'p': "7",  'q': "77", 'r': "777", 's': "7777", # p - s
    'P': "#7", 'Q': "#77",  'R': "#777", 'S': "#7777", # P - S
    
    't': "8",  'u': "88", 'v': "888", # t - v
    'T': "#8", 'U': "#88",  'V': "#888", # T - V
    
    'w': "9",  'x': "99", 'y': "999", 'z': "9999", # w - z
    'W': "#9", 'X': "#99",  'Y': "#999", 'Z': "#9999", # W - Z
}


n = int(input())
old_number_key = None
for i in range(n):
    word = input()
    for c in word:
        if c == ' ':
            old_number_key = None
            print('0', end='')
            continue
        
        # repeat key
        number_key =  get_number_key(c)
        if ord(c) >= 97 and number_key == old_number_key:
            print('*', end='')
            old_number_key = number_key
        else:
            print('*', end='')
        
        print(keyboard[c], end='')
    print()