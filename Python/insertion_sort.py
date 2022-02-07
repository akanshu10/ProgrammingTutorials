from numpy import sort


a=[]
n=int(input("Enter the number of element in array : "))
for i in range (0,n):
    b = int(input("Enter the element of array : "))
    a.append(b)
sorted_array = a[0]
for i in range(1,n):
    temp = a[i]
    j = i-1
    while(j>=0 and a[j]>temp):
        a[j+1] = a[j]
        j-=1
    a[j+1]=temp
for i in range(0,n):
    print(a[i],end =" ")
