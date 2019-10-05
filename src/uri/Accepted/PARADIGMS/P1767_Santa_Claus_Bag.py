# Date: 12-09-2019
# author : Teerapat Phokhonwong
# Online judge: URI Online Judge
# Categories: PARADIGMS
# Problem: 1767 - Santa Claus Bag
# Link: https://www.urionlinejudge.com.br/judge/en/problems/view/1767
# Timelimit: 1 sec
# Status: Accepted
# Submission: 9/12/19, 5:26:16 PM
# Runtime: 2.588s
# Solution:
# Note:

PAC = None

#knapsack bottom-up
def knapsack_soln(v,w):
    V = [[0 for x in range(51)] for y in range(PAC+1)]
    W = 0
    amount = 0
    for i in range(PAC+1): V[i][0] = 0
    for i in range(1, 51): V[0][i] = 0
    for i in range(1, PAC+1):
        for j in range(1, 51):
            if j < w[i]:
                V[i][j] = V[i-1][j]
            else:
                V[i][j] = max(V[i-1][j], v[i]+V[i-1][j-w[i]])

    #find answer detail
    i = PAC
    j = 50
    while i > 0 and j > 0:
        if j >= w[i] and V[i][j] == v[i]+V[i-1][j-w[i]]:
            W += w[i]
            amount+=1
            j = j-w[i]
        i-=1

    return [V[PAC][50], W, amount]

if __name__ == '__main__':
    N = int(input())
    for i in range(N):
        PAC = int(input())
        v = [0] * (PAC+1)
        w = [0] * (PAC+1)
        for p in range(1,PAC+1):
            qt,weight  = map(int, input().split())
            v[p] = qt
            w[p] = weight

        answer = knapsack_soln(v,w)
        print("%d brinquedos" % answer[0])
        print("Peso: %d kg" % answer[1])
        print("sobra(m) %d pacote(s)\n" % (PAC-answer[2]))

