import random

def check(rand,guess):
    if abs(rand-guess)<=10:
        print("Little low")
        return
    elif abs(rand-guess>10 and rand-guess<=20):
        print("Little high")
        return
        
    if rand<guess:
        print("Too high")
    else:
        print("Too low")



random_number=random.randint(1,101)
print("Guess a number between 1 and 100 in 5 tries")
for i in range(5):
    guess_number=int(input(f"Enter guess number try {i+1}:"))
    if guess_number==random_number:
        print(f"Your score is {1000-i+1*100}")
        break
    check(random_number,guess_number)
    

