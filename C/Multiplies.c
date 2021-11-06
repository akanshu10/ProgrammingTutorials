//Multiples of the number 
#include<stdio.h>
int main(){
    int num,i,j=0,k,Mul[100];
    printf("Enter the Number:\n");
    scanf("%d",&num);
    i=num;
    while(i>0){
        if(num%i==0){
            Mul[j]=i;
            j++;
        }
        i=i-1;
    }
    for(k=j-1;k>=0;k--){
        printf("%d",Mul[k]);
        if(Mul[k]!=num)
        printf("x");
    }
    return 0;
}
