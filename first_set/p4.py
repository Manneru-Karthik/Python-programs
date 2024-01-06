def check(password):
    if len(password)<6 or len(password)>16:
        return False
    mychar=('$','@','#')
    sm=0
    bi=0
    num=0
    cha=0
    for ch in password:
        if "a"<=ch<="z":
            sm=sm+1
        elif "A"<=ch<="Z":
            bi=bi+1
        elif "0"<=ch<="9":
            num=num+1
        elif ch in mychar:
            cha=cha+1
    if sm>=1 and bi>=1 and num>=1 and cha>=1:
        return True
    else:
        return False       






password=input("Enter a password")
if check(password):
    print("Its valid password")
else:
    print("Invalid password")


