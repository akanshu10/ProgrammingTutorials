#include<stdio.h>
int main(){
	int num,unit_digit=0;
	printf("Enter the number :");
	scanf("%d",&num);
	unit_digit=num%10;
	if(unit_digit==0 || unit_digit==5){
		printf("The number %d is divisible by 5",num);
	}
	else{
		printf("Number %d is not divisible by 5",num);
	}
}
