numbers = []
for i in range(1, 51):
    numbers.append(i)
print("Original list:")
print(numbers)
for num in numbers:
    if num % 2 == 0:
        numbers.remove(num)
print("List after removing even numbers:")
print(numbers)

fruits = ["apple", "banana", "kiwi", "orange", "grape", "Strawberry", "Peach"]
for f in fruits:
    if len(f) <= 5:
        fruits.remove(f)
print(fruits)
