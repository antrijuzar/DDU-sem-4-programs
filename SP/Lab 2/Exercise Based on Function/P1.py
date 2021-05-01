# Check the output of following code and justify your answer:
x = 50
def func(x):
    print('x is',x)
    x = 2
    print('Changed local x to',x)
func(x)
print('x is now',x)
# Justification : the function did not changed the value of x because
#                 their are 2 scopes for variable x:
                # i. in main
                # ii. in function
                # Hence the changed value in the function does not 
                # affect the main variable x scope.