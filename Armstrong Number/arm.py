# Writing code using python

x=int(input('Enter a Number'))
s=0
n=x
while n!= 0:
    z=n%10
    s=z*z*z
    n=n/10
if s == x:
    print('Armstrong Number')
else:
    print('Not an Amrstrong Number')
