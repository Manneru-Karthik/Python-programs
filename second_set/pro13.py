num_vowels=0
num_consonant=0

str=input("Enter the string: ").lower()
vowels=['a','e','i','o','u']
for ch in str:
    if ch in vowels:
        num_vowels=num_vowels+1
    elif ch==" ":
        continue
    else:
        num_consonant=num_consonant+1

print("Number of vowels are ",num_vowels)
print("Number of consonants are ",num_consonant)