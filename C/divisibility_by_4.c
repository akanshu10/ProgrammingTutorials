#include<stdio.h>
int main(){
	int num,ten_digit=0,unit_digit=0,num1,last=0;
	printf("Enter the number :");
	scanf("%d",&num);
	num1=num;
	unit_digit=num1%10;
	num1=num/10;
	ten_digit=num1%10;
	last=10*ten_digit+unit_digit;
	if(last%4==0){
		printf("\nThe number %d is divisible by 4",num);
	}
	else{
		printf("\nThe number %d is not divisible by 4",num);
	}
	
}
