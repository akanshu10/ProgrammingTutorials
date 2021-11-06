//find the digital sum of given number

#include<stdio.h>
int main(){
int digital_sum=0,num,count=1;
printf("Enter the number to find the digital sum ");
scanf("%d",&num); //enter the number 
while(num>0||digital_sum>=10){ 
	digital_sum=digital_sum+num%10;
	num=num/10;
	if(digital_sum>=10&&num==0){
		num=digital_sum;
		digital_sum=0;
		count++;
	}	
}
printf("Digital Sum : %d",digital_sum);
printf("\nAdditive Parsistence :%d",count);
}
