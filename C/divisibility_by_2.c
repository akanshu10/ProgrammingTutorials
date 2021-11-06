#include<stdio.h>
int main(){
	int num,unit_digit=0;
	printf("Enter the number :");
	scanf("%d",&num);
	unit_digit=num%10;
	if(unit_digit%2==0){
		printf("\nThe number %d is divisible by 2",num);
	}
	else{
		printf("\nThe number %d is not divisible by 2",num);
	}
}
