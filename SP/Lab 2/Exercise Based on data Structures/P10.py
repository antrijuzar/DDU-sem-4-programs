# Following are the lists of students studying Maths, Physics and Chemistry 
# subjects,

# Maths = {1, 2, 3, 5, 7, 9}
# Physics = { 2, 4, 6, 9}
# Chemistry = {1, 3, 5, 9}
# Display the numbers which are studying both maths & physics, 
# physics & chemistry, maths&chemistry and all three. Also, display
# the numbers which are studying exactly one of the three subjects.

Maths = {1, 2, 3, 5, 7, 9}
Physics = { 2, 4, 6, 9}
Chemistry = {1, 3, 5, 9}

print("The numbers studying both math and physics are :",end = " ")
for n1 in Maths:
    for n2 in Physics:
        if n1 == n2:
            print(n1,end = " ")
            
print()          
print("The numbers studying both physics and chemistry are :",end = " ")
for n1 in Physics:
    for n2 in Chemistry:
        if n1 == n2:
            print(n1,end = " ")
            
print()
print("The numbers studying both math and chemistry are :",end = " ")
for n1 in Maths:
    for n2 in Chemistry:
        if n1 == n2:
            print(n1,end = " ")
            
print()
print("The numbers studying all 3 subjects are :",end = " ")
for n1 in Maths:
    for n2 in Chemistry:
        for n3 in Physics:
            if n1 == n2 == n3:
                print(n1,end = " ")
        
print()
print("The numbers studying exactly one subject are :",end = " ")
for n1 in Maths:
    if n1 not in Chemistry:
        if n1 not in Physics:
            print(n1,end = " ")