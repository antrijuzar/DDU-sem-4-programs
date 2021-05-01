# Write a program to delete record of a specific student (e.g. ramu).
student_record = []
record1 = {'student_id':1,'name':"ram",'age':18,'percentage':65}
record2 = {'student_id':2,'name':"shyam",'age':17,'percentage':70}
record3 = {'student_id':3,'name':"radha",'age':17,'percentage':75}
record4 = {'student_id':4,'name':"ramu",'age':17,'percentage':75}
record5 = {'student_id':5,'name':"ankit",'age':17,'percentage':75}
student_record.append(record1)
student_record.append(record2)
student_record.append(record3)
student_record.append(record4)
student_record.append(record5)

for i in range(0,5):
    if student_record[i]['name'] == "ramu":
        student_record.pop(i)
        break;

print("After deletion of ramu's record")
for i in range(0,4):
    print("ID : ",student_record[i]['student_id'])
    print("Name : ",student_record[i]['name'])
    print("Age : ",student_record[i]['age'])
    print("Percentage : ",student_record[i]['percentage'],"%")
