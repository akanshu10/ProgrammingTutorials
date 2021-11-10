#include<stdio.h>
int main(){
int a,b,c;
printf("Enter a:");
scanf("%d",&a);
printf("Enter b:");
scanf("%d",&b);
//c=a;
//a=b;
//b=c;
a=a+b;
b=a-b;
a=a-b;
printf("After swapping a= %d ,b= %d",a,b);
}
