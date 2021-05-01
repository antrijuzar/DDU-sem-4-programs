# Write a function to compute simple interest using provided values 
# as arguments if rate of interest is not provided consider it as 3.5%.
def calculateInterest(p,t,r = 3.5):
    si = float((r*p*t)/100)
    print("Simple interest is ",si)
    
principle = int(input("Enter Principle: "))
rate = float(input("Enter rate per interest: "))
time = int(input("Enter time period: "))
calculateInterest(principle,time,rate)