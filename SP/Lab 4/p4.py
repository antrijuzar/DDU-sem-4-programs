# Create class exam having three member variable to store the marks of 
# three subject. Overload <, > and = operator to compare two object of
# Exam class based on total marks. Also write executable statements to
# test Exam class.
class Exam:
    def __init__(self,sub1,sub2,sub3):
        self.sub1 = sub1
        self.sub2 = sub2
        self.sub3 = sub3
        self.total = sub1+sub2+sub3
    def __lt__(self,other):
        if self.total < other.total:
            print("Ob1 marks are less than ob2 ")
    def __gt__(self,other):
        if self.total > other.total:
            print("Ob1 marks are greater than ob2 ")
    def __eq__(self,other):
        if self.total == other.total:
            print("Ob1 marks are equal to ob2 ")
        
    
ob1 = Exam(75,40,85)
ob2 = Exam(50,71,80)    
(ob1 < ob2)
(ob1 > ob2)
(ob1 == ob2)