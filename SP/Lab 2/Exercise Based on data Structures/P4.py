# Write a program to concat student records (created in (3)) of different 
# semesters.
student_record = []
record1 = {'student_id':1,'name':"ram",'age':18,'percentage':65}
record2 = {'student_id':2,'name':"shyam",'age':17,'percentage':70}
record3 = {'student_id':3,'name':"radha",'age':17,'percentage':75}
student_record.append(record1)
student_record.append(record2)
student_record.append(record3)

n = int(input("Enter no. of students to enter :"))
for i in range(0,n):    
    id = int(input("Enter id :"))
    name = str(input("Enter name :"))
    age = int(input("Enter age :"))
    percent = int(input("Enter percent :"))
    r = {'student_id':id,'name':name,'age':age,'percentage':percent}
    student_record.append(r)
    
print(student_record)