mytuple=(1,2,3,4,5,6,7,8)
even=0
odd=0
for num in mytuple:
    if num%2==0: even=even+1
    else: odd=odd+1
print("even:",even)
print("odd:",odd)