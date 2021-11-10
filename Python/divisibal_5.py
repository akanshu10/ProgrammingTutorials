num=int(input("Enter the number :"))
unit_digit=num%10
if(unit_digit==0 or unit_digit==5):
    print("The number {} is divisible by 5".format(num))
else:
    print("The number {} is not divisible by 5".format(num))