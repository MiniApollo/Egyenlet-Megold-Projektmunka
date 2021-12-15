import math

try:
a = float(input("a értéke: "))
b = float(input("b értéke: "))
c = float(input("c értéke: "))
d = (pow(b,2) - 4 * a * c)
if a == 0:
    e = -(b/c)
    print(e)
else:
    if d > 0:
        x1 = (-(b) + math.sqrt(d)) / (2 * a)
        print(x1)
        x2 = (-(b) - math.sqrt(d)) / (2 * a)
        print(x2)
    elif d == 0:
        x = -(b/c*2)
        print(x)
    elif d < 0:
        print("Nincs megoldás!")
    else:
        print("hiba")
