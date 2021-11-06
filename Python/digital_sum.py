num=int(input("Enter the number"))
count=1
digital_sum=0
while(num>0 or digital_sum>=10):
    digital_sum=int(digital_sum+num%10)
    num=num/10
    if(digital_sum>=10 and num==0):
        num=digital_sum
        digital_sum=0
        count=count+1
print("Digital sum :",int (digital_sum))
print("Additive Parsistence :",count)