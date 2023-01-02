# Problem: 3069 - Sorvete
# Link: https://www.urionlinejudge.com.br/judge/en/problems/view/3069
# Answer: Accepted
# Submission: 4/1/20, 10:08:14 AM
# Runtime: 0.760s

class Point:
    def __init__(self, u, v):
        self.start = u
        self.end = v


if __name__ == "__main__":
    t = 1
    while True:
        p, s = map(int, input().split())
        if p == 0 and s == 0:
            break
        print("Teste " + str(t))
        collect = set()
        for x in range(s):
            u, v = map(int, input().split())
            collect.add(Point(u, v))
        collect = sorted(collect, key=lambda x: x.start, reverse=False)

        # for x in collect:
        #     print(x.start, x.end)
        # print()

        isStarted = 0
        _min = 0
        _max = 0
        for o in collect:
            if isStarted == 0:
                _min = o.start
                _max = o.end
                isStarted = 1
                continue

            if o.start > _max:
                print(_min, _max)
                _min = o.start
                _max = o.end
            elif o.start <= _max < o.end:
                _max = o.end

        print(_min, _max)

        t += 1
        print()
