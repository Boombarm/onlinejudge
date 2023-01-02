c = list(input())
encryptword = list(input())
decrypt = []
for x in encryptword:
    decrypt.append(c[ord(x)-ord('a')])
    
print(''.join(decrypt))
