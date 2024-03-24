# author : Teerapat Phokhonwong
# Problem: 3475 - Converter
# Categories: AD-HOC
# Link: https://judge.beecrowd.com/en/problems/view/3475
# Answer: Accepted
# Submission: 3/24/24, 11:53:13 PM
# Runtime: 0.009s
# FILE SIZE: 198 Bytes

portuguese_num = {
    '0': 'zero',
    '1' : 'um',
    '2' : 'dois',
    '3' : 'tres',
    '4' : 'quatro',
    '5' : 'cinco',
    '6' : 'seis',
    '7' : 'sete',
    '8' : 'oito',
    '9' : 'nove',
    'zero': '0',
    'um': '1',
    'dois': '2',
    'tres': '3' ,
    'quatro': '4',
    'cinco': '5',
    'seis': '6',
    'sete': '7',
    'oito': '8',
    'nove': '9',
}

print(portuguese_num.get(input(), 'Invalid input'))
