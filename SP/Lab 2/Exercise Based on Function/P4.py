# Write a function to swap two values provided as arguments.
def swap(s1,s2):
    temp = s1
    s1 = s2
    s2 = temp
    # Got it from internet but dont know how it works
    # s1, s2 = s2, s1
    print("After swaping : a","=",s1,"b =",s2)
n1 = int(input("Enter a :"))
n2 = int(input("Enter b :"))
swap(n1,n2)
