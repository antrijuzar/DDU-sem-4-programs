# Write a program to sort student record by values (e.g. name).
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

for key in sorted(student_record,key = lambda i : i['name'],reverse=False):
    print("ID : ",key['student_id'])
    print("Name : ",key['name'])
    print("Age : ",key['age'])
    print("Percentage : ",key['percentage'],"%")