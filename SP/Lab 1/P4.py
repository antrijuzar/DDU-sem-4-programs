print("Enter any 3 numbers :")
n1 = int(input())
n2 = int(input())
n3 = int(input())
if n1 > n2 and n1 > n3:
    print(str(n1) +" is greater")
if n2 > n1 and n2 > n3:
    print(str(n2) +" is greater")
if n3 > n2 and n3 > n1:
    print(str(n3) + " is greater")
