# first 
a=-5
if a>0:
    if a%2==0:
        print(str(a) + " is positive even number")
else:
    print(str(a) + " is negative number")
# Output is : -5 is negative number because the outer if statement is evaluated
# and the condition is false so the else statement gets executed.

# second
a=5
if a>0:
    if a%2==0 :
        print(str(a) + " is positive even number")
    else:
        print(str(a) + " is odd number")
# Output is : 5 is odd number because the outer if statement is evaluated
# first and the condition is true so the inner if statement gets executed
# abd the condition is false so inner else is evaluated finally