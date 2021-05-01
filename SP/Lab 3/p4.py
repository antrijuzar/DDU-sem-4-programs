import csv
count = 0
with open("records.csv","r") as records:
    reader = csv.reader(records)
    for row in reader:
        count += 1
        print("{:<17}{:<12}{:<12}{:<8}".format(row[0],row[1],row[2]
                                       ,row[3]))
print("There are total",count-1,"students recorded in the file")