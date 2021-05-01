with open("helloworld.c","r") as read:
    with open("anotherhelloworld.txt","w+") as write:
        read = read.read().split()
        for line in read:
            if "//" != line:    
                print(line)
                write.write(line)
                write.write("\n")

write.close()