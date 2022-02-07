a=[]
n = int(input("Enter the number of Element in Array :"))
for i in range (0,n):
    b = int(input("Enter the element of Array :"))
    a.append(b)
for i in range(0,n):
    min=i
    for j in range (i+1,n):
        if(a[j]<a[min]):
            min=j
    if(min != i):
        temp = a[min]
        a[min]= a[i]
        a[i] =temp
for i in range(0,n):
    print(a[i],end=" ")