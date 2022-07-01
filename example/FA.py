import re

if __name__ == '__main__':
    regexp = re.compile('a*.(a)b')
    test_var = ['aaaaaaa', 'aaab', 'aaaaaaaaaaaaaa']
    for item in test_var:
        if regexp.fullmatch(item):
            print('matched')
        else:
            print('error')
