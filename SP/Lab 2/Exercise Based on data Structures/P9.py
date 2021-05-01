# Write a program to print all unique values in a dictionary.

# Sample Data : [{"V":"S001"}, {"V": "S002"}, {"VI": "S001"}, {"VI":
# "S005"}, {"VII":"S005"}, {"V":"S009"},{"VIII":"S007"}]
# Output : Unique Values: {'S005', 'S002', 'S007', 'S001', 'S009'}
data = [{"V":"S001"}, {"V": "S002"}, {"VI": "S001"}, {"VI":"S005"},
        {"VII":"S005"}, {"V":"S009"},{"VIII":"S007"}]

s = set()
for temp in data:
    for val in temp.values():
        s.add(val)
print (s)    