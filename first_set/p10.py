num = 10
j = 2
while j <= num:
    pm = 0
    i = 2
    while i <= j:
        if j % i == 0 and j != i:
            pm = pm + 1
        i = i + 1
    if pm == 0:
        print(j, end=" ")
    j = j + 1


    