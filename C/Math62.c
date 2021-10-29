//find the largest value of n in the 10^n which can exactly divided by 10 multiple factorials
#include<stdio.h>
int main(){
	int input1,input2,output,quotient1=0,quotient2=0;
	printf("Enter the multiple of 10 : \n");
	scanf("%d",&input1);
	input2=input1;
	while(input1>0){
		input1=input1/2;
		quotient1=quotient1+input1;
	}
	while(input2>0){
		input2=input2/5;
		quotient2=quotient2+input2;
	}
	if(quotient1<=quotient2){
		output=quotient1;
		printf("\nOutput = %d",output);
	}
	else{
		output=quotient2;
		printf("\nOutput = %d",output);
	}
}
