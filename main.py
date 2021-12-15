import math
a=float(input("Add meg az a értékét!"))
b=float(input("Add meg a b értékét!"))
if a==0:
    if b==0:
        print("Az összes valós szám megoldás!")
    else:
        print("Nincs megoldás!")
else:
    m=-(b/a)
    print("A megoldás:",m)
