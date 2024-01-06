
str=input("Enter a string: ")


for i in range(len(str)):
    if str.count(str[i])>0 and str[i]!=" ":
      print(str[i],"appears",str.count(str[i]),"times")