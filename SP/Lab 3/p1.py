fopen = open("test.txt",'r')
data = fopen.read()

#cleaning
data = data.lower()
words = data.split()
words = [word.strip('.;,!()[]') for word in words]
words = [word.replace("'s",'') for word in words]

#finding unique
unique = []
occurrence = {}
for word in words:
    if word not in unique:
        occurrence[word] = 0
        unique.append(word)
        
for word in words:
    if word in unique:
        occurrence[word] += 1
#print
print("Word \t Occurred")
for k in occurrence: 
    print("{:<16}{:<0}".format(k,occurrence[k]))
