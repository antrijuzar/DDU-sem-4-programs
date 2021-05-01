# Armstrong numbers
n = int(input("Enter the value of n to find armstrong numbers :"))
for i in range(1,n):
    temp = i
    sum = 0
    while temp > 0:
        t1 = int(temp%10)
        sum = sum + (t1*t1*t1)
        temp = temp/10;
    if sum == i:
        print(i,"is a Armstrong number")