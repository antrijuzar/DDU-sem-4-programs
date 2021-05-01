def maximum(x,y,z):
    if x > y and x > z:
        return x
    if y > x and y > z:
        return y
    if z > x and z > y:
        return z
n1 = int(input("Enter num 1 :"))
n2 = int(input("Enter num 2 :"))
n3 = int(input("Enter num 3 :"))
print(maximum(n1,n2,n3))