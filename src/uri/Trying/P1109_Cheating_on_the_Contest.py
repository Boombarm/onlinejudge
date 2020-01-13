# https://www.urionlinejudge.com.br/judge/en/problems/view/1109

data_link = []
first_node = None

class Node:
    def __init__(self, data, or_node, next_node, repeat=False):
        self.data = data
        self.nextNode = next_node
        self.orNode = or_node
        self.repeat = repeat


# VOID
def build_fA(fa_input):
    c = False
    level = 0
    strNode = ""
    for x in fa_input:
        if x == '(':
            c = True
            level += 1
        elif x == ')':
            level -= 1
            if strNode != '':
                print(strNode)
                strNode = ""

            if level == 0:
                c = False

        else:
            strNode += x



def test_fa(t_case):
    return True


if __name__ == "__main__":
    while True:
        fa_input = input()
        build_fA(fa_input)
        n = int(input())
        for x in range(n):
            t_case = input()
            if test_fa(t_case):
                print("Y")
            else:
                print("N")
