f=open("fruits.txt","r")

f.close()


f=open("fruits.txt","r")
for line in f:
    print(line)
