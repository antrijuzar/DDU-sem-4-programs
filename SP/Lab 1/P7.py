flag = False
val = int(input("Enter a number : "))
for i in range(2,val):
    if i != 0 and i != 1:
        if (val % i) == 0:
            flag = True
            
if flag:
    print(val, "is not prime") 
else:    
    print(val, "is prime")
