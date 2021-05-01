import array as arr
a = arr.array('i',[1111,3333,1235,2378,1212,1456,2134,2345,1111,8231,2222,9999])
for x in a:
    print(x,x%64,bin(x%64))