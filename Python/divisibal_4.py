num=int(input("Enter the number :"))
unit_digit=num%10
num1=int(num/10)
ten_digit=num1%10
last=10*ten_digit+unit_digit
if(last%4==0):
    print("The number {} is divisible by {}".format(num,4))
else:
    print("The number {num} is not divisible by {d}".format(num=num,d=4))