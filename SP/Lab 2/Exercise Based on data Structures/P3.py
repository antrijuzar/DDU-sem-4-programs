# Write a program to create a record of student details. The record maintains following
# information < student_id, name, age, percentage>.
# Record1 : 1, „ram‟, „18‟, 65%
# Record 2 : 2, „shyam‟, 17‟, 70%
# add following records to the ‘student_record’ created in (3)
# Record 3 : 3, „Radha‟, „17‟, 75%
student_record = []
record1 = {'student_id':1,'name':"ram",'age':18,'percentage':65}
record2 = {'student_id':2,'name':"shyam",'age':17,'percentage':70}
record3 = {'student_id':3,'name':"radha",'age':17,'percentage':75}
student_record.append(record1)
student_record.append(record2)
student_record.append(record3)
print(student_record)
