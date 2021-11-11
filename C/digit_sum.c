#include<stdio.h>
int  main(){
    int num,digit_sum=0;
    printf("Enter the number :");
    scanf("%d",&num);
    digit_sum=digit_sum+num%10;
    num=num/10;
    digit_sum=digit_sum+num%10;
    num=num/10;
    digit_sum=digit_sum+num%10;
    num=num/10;
    digit_sum=digit_sum+num%10;
    num=num/10;
    digit_sum=digit_sum+num%10;
    num=num/10;
    printf("Digit sum : %d",digit_sum);

}