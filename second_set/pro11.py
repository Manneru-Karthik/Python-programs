print("Think of a number between 1 and 100: ")
low = 0
high = 100
while True:
    mid = (low + high)//2
    ans = input(f"Is your number greater than {mid}? ").lower()
    if ans == "yes":
        low = mid+1
    elif ans == "no":
        high = mid-1
    else:
        print("Enter valid input!")
    if low == high:
        break
print(f"Your number is {low}")
