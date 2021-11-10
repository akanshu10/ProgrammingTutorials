#include<stdio.h>
int main(){
	int leap_year;
	printf("Enter the year :");
	scanf("%d",&leap_year);
	if(leap_year%400==0){
		printf("\nYear %d is a leap year",leap_year);
	}
	else if(leap_year%100==0){
		printf("\nYear %d is not a leap year",leap_year);
	}
	else if(leap_year%4==0){
		printf("\nYear %d is a leap year",leap_year);
	}
	else{
		printf("\nYear %d is not a leap year",leap_year);
	}
}
