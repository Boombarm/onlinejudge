# Problem: 2683 - The Change Continues!!
# Link: https://www.urionlinejudge.com.br/judge/en/problems/view/2683
# Answer: Accepted
# Submission: 5/1/20, 6:53:20 PM 
# Runtime: 0.024s

import sys

if __name__ == "__main__":
    while True:
        input_ = sys.stdin.readline()
        if (input_ == ""): break
        
        m = float(input_)

        t = m * 240
        H = ((int(t / 3600) % 60) + 6) % 24
        M = int(t / 60) % 60
        S = int(t) % 60

        if m >= 0 and m < 90:
            print("Bom Dia!!\n%02d:%02d:%02d" % (H,M,S))
        elif m >= 90 and m < 180:
            print("Boa Tarde!!\n%02d:%02d:%02d" % (H,M,S))
        elif m >= 180 and m < 270:
            print("Boa Noite!!\n%02d:%02d:%02d" % (H,M,S))
        elif m>= 270 and m < 360:
            print("De Madrugada!!\n%02d:%02d:%02d" % (H,M,S))