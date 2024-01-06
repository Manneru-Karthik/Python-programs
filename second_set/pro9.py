list=["Celsius to Fahrenheit","Fahrenheit to Celsius"]

for i in range(len(list)):
    print(f"{i+1}. {list[i]}")

select=int(input("Select the type of conversion u needed:"))
if select==1:
    cels=float(input("Enter the value of celsius:"))
    fahren=(9/5)*cels+32
    print("The value of fahrenheit will be",fahren," for celsius",cels)
elif select==2:
    fahren=float(input("Enter the value of fahrenheit:"))
    cels=(5/9)*fahren-32
    print("The value of celsius will be",cels," for fahrenheit",fahren)
else:
    print("Invalid option")