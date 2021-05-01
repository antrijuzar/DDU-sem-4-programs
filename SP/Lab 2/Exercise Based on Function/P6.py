# Write a function to compute the sum of data of variable length.
def calSum(*var):
    sum = 0
    for val in var:
        sum += val
    print(sum)
calSum(1,2,2,3,4,54,5,7,7,7)
