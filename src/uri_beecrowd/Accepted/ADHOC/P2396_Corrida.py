class Car:
    def __init__(self,id, tempo):
        self.id = id
        self.tempo = tempo

N,M = map(int, input().split())
P = []
for i in range(N):
    tempo = list(map(int, input().split()))
    car = Car(i+1, 0)
    for j in range(0,M):
        car.tempo += tempo[j]
    P.append(car)
P.sort(key=lambda x: x.tempo)
for i in range(3):
    print(P[i].id)
        
    