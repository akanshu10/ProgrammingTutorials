num=int(input("Enter the number :"))
num1=num
sum=0
while(num1>0):
    sum=int(sum+num1%10)
    num1=num1/10
if(sum%3==0):
    print("The number {} is divisible by 3".format(num))
else:
    print("The number {} is not divisible by 3.".format(num))