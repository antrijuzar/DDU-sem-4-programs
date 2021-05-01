# Write a program to combine following dictionaries by averaging values for 
# common keys.
# D1 = {‘ram’:60, ‘shyam’:70, ‘radha’:70}
# D2 = {‘ram’:70, ‘shyam’:80, ‘gopi’:60}
# output : {‘ram’:65, ‘shyam’:75, ‘radha’:70, ‘gopi’:60}

D1 = {'ram':60, 'shyam':70, 'radha':70}
D2 = {'ram':70, 'shyam':80, 'gopi':60}
output = dict()
for key in D1:
    if key in D2:
        output[key] = int((D1[key]+D2[key])/2)
    else:
        output[key] = D1[key]
        for key in D2:
            if key not in D1 and key not in output:
                output[key] = D2[key]
        

print(output)