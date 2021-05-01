sub1 = int(input("Enter Math mark : "))
sub2 = int(input("Enter DDC mark : "))
sub3 = int(input("Enter FMA mark : "))
sub4 = int(input("Enter CSA mark : "))
sub5 = int(input("Enter JAVA mark : "))
sum = sub1 + sub2 + sub3 + sub4 + sub5
avg = sum / 5
if avg >= 80:
    print("Grade A")
elif avg >=60 and avg < 80:
    print("Grade B")
elif avg >=40 and avg < 60:
    print("Grade C")
elif avg >=20 and avg < 40:
    print("Grade D")
else:
    print("You have been failed")
    