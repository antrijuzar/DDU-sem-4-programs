import sys
with open("myfile.txt","w+") as f1:
    f1.write("1 2 3")
    f1.seek(0,0)
    print(f1.read())

with open("myfile.txt","w+") as f1:
    f1.write("123")
    f1.seek(0,0)
    print(f1.read())

try:
    # no error if data is only integer
    f = open('myfile.txt')
    s = f.readline()
    i = int(s.strip())
    print(i)
except OSError as err:
    # this error gets printed when the file is not available
    print("OS error: {0}".format(err))
except ValueError:
    # this error gets printed when the file is available because we 
    # cannot convert string data to int
    print("Could not convert data to an integer.")
except:
    print("Unexpected error:", sys.exc_info()[0])
    raise
    f.close()
    
