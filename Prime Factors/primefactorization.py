n=int(input("Enter an integer:"))
print("Factors are:")

def fn(a):
    c=0
    for i in range(1,a+1):
        if a % i ==0:
            c=c+1
    if c == 2:
            print(a)
            
for i in range(1,n+1):
    
    if n % i == 0 :
        fn(i)