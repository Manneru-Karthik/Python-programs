str="Hello 098123 and 456!"

list=[]
for ch in str:
    if "0"<=ch<="9":
        list.append(ch)

print(list)