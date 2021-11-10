#include<stdio.h>
#include <stdlib.h>
int main(){
int num,flag,i,j,k=0,l,count=0,total_factor_sum=0,temp,num1,arr[100],arr2[100],arr1[50];
printf("Enter a Natural number :\n");
scanf("%d",&num);
num1=num;
for(i=2;i<=num;i++){
	flag=1;
	for(j=2;j<=i/2;j++){
		if(i%j==0){
			flag=0;
			break;
		}
	}
	if(flag==1){
		arr[k]=i;
		k++;
	
	}
}
k=0;
j=0;
l=0;

while(num1>1){
	if(num1%arr[k]==0){
		arr2[count]=arr[k];
		count++;
		j++; 
		num1=num1/arr[k];
//		if(num1==1){
//			arr1[l]=arr[k];
//			l++;
//			arr1[l]=j;
//		}
	}
	else{
		
//	arr1[l]=arr[k];
//	l++;
//	arr1[l]=j;
//	l++;
//	j=0;
	k++;
	}
}

printf("Prime factors of a Natural number :\n");
for(i=0;i<count;i++){
	printf("%d ",arr2[i]);
	if(i+1!=count){
		printf("x ");
	}
}
//l=0;
//k=0;
//while(total_factor_sum!=count){
//	k=l+1;
//	printf("\nTotal number of %d's factors is :%d \n",arr1[l],arr1[k]);
//	l=l+2;
//	total_factor_sum=total_factor_sum+arr1[k];
//}
printf("\nTotal number of prime factors :\t %d",count);
}
