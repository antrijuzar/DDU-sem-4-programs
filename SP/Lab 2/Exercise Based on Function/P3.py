# Write a function to print prime numbers between provided range.
def finPrime(x,y):
    flag = 0
    for i in range(x,y):
        if i != 0:    
            for t in range(2,i):
                if int(i%t) == 0:
                    flag = 1
                    break
                
        if flag == 0:
            print(i,end=" ")
        flag = 0

print("Enter the start and end range :")
n = int(input())
m = int(input())
print("Prime number from ",n,"to",m,end=(" "))
finPrime(n,m)