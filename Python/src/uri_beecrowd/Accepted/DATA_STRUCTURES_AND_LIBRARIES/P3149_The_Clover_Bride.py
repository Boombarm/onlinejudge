# author : Teerapat Phokhonwong
# Problem: 3149 - The Clover Bride
# Link: https://www.beecrowd.com.br/judge/en/problems/view/3149
# Answer: Accepted
# Submission: 12/14/22, 4:25:03 PM
# Runtime: 0.065s
# Note: จับรายชื่อในช่วงนาที ระหว่างเที่ยงคืน (+- ตามค่า P) เรียงลำดับตามเวลา

class Person:
    def __init__(self, h, m, time_range, name) -> None:
        self.h = h
        self.m = m
        self.time_range = time_range
        self.name = name

class PriorityQueue(object):
    def __init__(self):
        self.queue = []
 
    def isEmpty(self):
        return len(self.queue) == 0

    def insert(self, data):
        idx = 0
        for item in self.queue:
            if data.h == 23 and item.h == 0:
                break
            elif data.h == item.h \
            and ((item.h == 0 and data.time_range < item.time_range) or (item.h == 23 and data.time_range > item.time_range)) :
                break
                
            idx += 1
        self.queue.insert(idx, data)
 
    def pop(self):
        item = self.queue[0]
        del self.queue[0]
        return item

queue = PriorityQueue()
p, q = map(int, input().split())
for i in range(q):
    t, name = map(str, input().split())
    h, m = map(int, t.split(":"))
    if h == 23:
        time_range = 60 - m
    else:
        time_range = m

    if time_range <= p:
        queue.insert(Person(h, m ,time_range, name))

while not queue.isEmpty():
    item = queue.pop()
    print(item.name)
