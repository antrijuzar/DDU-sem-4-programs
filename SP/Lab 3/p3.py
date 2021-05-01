import csv
student_records = {"0" :("student_id","name","age","percentage"),
                   "1" :(1,"Juzar",18,"60%"),
                   "2" :(2,"Abbas",16,"70%"),
                   "3" :(3,"Hussain",17,"66%"),
                   "4" :(4,"Khozem",19,"69%"),
                   "5" :(5,"Harshil",20,"90%"),
                   "6" :(6,"Quresh",18,"80%"),
                   "7" :(7,"Juama",17,"650%")}

with open("records.csv","w+",newline='') as write:    
    writer = csv.writer(write)

    for k in student_records:        
        writer.writerow(student_records[str(k)])
    write.close()