import sys
import math

# Auto-generated code below aims at helping you parse
# the standard input according to the problem statement.

surface_n = int(input())  # the number of points used to draw the surface of Mars.
for i in range(surface_n):
    # land_x: X coordinate of a surface point. (0 to 6999)
    # land_y: Y coordinate of a surface point. By linking all the points together in a sequential fashion, you form the surface of Mars.
    land_x, land_y = [int(j) for j in input().split()]

# game loop
while True:
    # h_speed: the horizontal speed (in m/s), can be negative.
    # v_speed: the vertical speed (in m/s), can be negative.
    # fuel: the quantity of remaining fuel in liters.
    # rotate: the rotation angle in degrees (-90 to 90).
    # power: the thrust power (0 to 4).
    x, y, h_speed, v_speed, fuel, rotate, power = [int(i) for i in input().split()]
    # Write an action using print
    # To debug: print("Debug messages...", file=sys.stderr, flush=True)
    if v_speed < -40:
        v_speed = -40
    
    if v_speed == -40:
        power = 4
    
    
    print(f'power: {power}', file=sys.stderr, flush=True)
    print(f'h_speed: {h_speed}', file=sys.stderr, flush=True)
    print(f'v_speed: {v_speed}', file=sys.stderr, flush=True)
    # 2 integers: rotate power. rotate is the desired rotation angle (should be 0 for level 1), power is the desired thrust power (0 to 4).
    #print("0 3")
    print(rotate , power)
