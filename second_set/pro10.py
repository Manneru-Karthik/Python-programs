days = {
    "monday": 0,
    "tuesday": 0,
    "wednesday": 0,
    "thursday": 0,
    "friday": 0,
    "saturday": 0,
    "sunday": 0
}


def add_new_entry():
    day = input("Enter the day: ").lower()
    amount = int(input("Enter the amount: "))
    days[day] += amount
    print(f"Rs.{amount} is added to {day}'s expenses")


def remove_entry():
    day = input("Enter the day: ").lower()
    amount = int(input("Enter the amount: "))
    days[day] -= amount
    print(f"Rs.{amount} is removed from {day}'s expenses")


def total_spending():
    global spending
    for i in days:
        spending += days[i]
    print("Total spending = ",spending)


def remaining_budget():
    remaining = income - spending
    print("Remaining budget: ",remaining)


income = 2000
spending = 0

while True:
    print("Menu:\n1: Add new entry\n2: Remove entry\n3: Total spending \n4:Remaining budget\n5: Exit")
    inp = int(input("Enter your choice(1-5): "))
    if inp == 1:
        add_new_entry()
    elif inp == 2:
        remove_entry()
    elif inp == 3:
        total_spending()
    elif inp == 4:
        remaining_budget()
    elif inp == 5:
        exit()
    else:
        print("Invalid input!")
