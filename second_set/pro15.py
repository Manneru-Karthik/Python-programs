items = []


def add_item():
    item = input("Enter the item to add:").capitalize()
    items.append(item)
    print(f"{item} has been added to the shopping list.")


def remove_item():
    item = input("Enter the item to remove:").capitalize()
    if item in items:
        items.remove(item)
        print(f"{item} has been removed from the shopping list.")
    else:
        print(f"{item} is not in the shopping list.")


def show_items():
    if len(items) == 0:
        print("Your shopping list is empty.")
    else:
        print("Shopping list:")
        for i in range(1, len(items)+1):
            print(f"{i}:{items[i-1]}")


while True:
    print("Menu:\n1:Add item\n2:Remove item\n3:Show items in the list\n4:Exit")
    choice = input("Enter your choice(1-4): ")
    if choice == "1":
        add_item()
    elif choice == "2":
        remove_item()
    elif choice == "3":
        show_items()
    elif choice == "4":
        exit()
    else:
        print("Invalid input!")
