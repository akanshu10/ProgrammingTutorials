num=int(input("Enter the number "))
unit_digit=num%10
if(unit_digit%2==0):
    print("The number %(num)d  is divisible by 2" %{"num":num})
else:
    print("The number %(num)d is not divisible by 2"%{"num":num})