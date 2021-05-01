# Write a program to remove duplicates from the list (created in Ex:(1)) 
# and print unique names.
list = ["ramu", "shyamu", "kanu", "manu", "ramu", "radha", "manu"]
duplicate = set()
union = []
k = 7
for i in list:
    if i not in duplicate:
        union.append(i)
        duplicate.add(i)
print(union)