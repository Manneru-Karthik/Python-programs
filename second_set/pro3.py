import datetime


def greeting(name,x):
    if x.strftime("%H")>"00" and x.strftime("%H")<"12":
        print(f"Hello {name},Good morning")
    elif x.strftime("%H")>"12" and x.strftime("%H")<"17":
        print(f"Hello {name},Good afternoon")
    elif x.strftime("%H")>"17" and x.strftime("%H")<"21":
        print(f"Hello {name},Good evening")
    else:
        print(f"Hello {name},Good night")



x=datetime.datetime.now()
name=input("Enter a name to whom u want to greet: ")
greeting(name,x)



