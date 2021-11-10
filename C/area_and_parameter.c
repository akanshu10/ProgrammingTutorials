#include<stdio.h>
# define PI 3.14
int main(){
	float area,parameter;
	int radius;
	printf("Enter the radius of a circle :");
	scanf("%d",&radius);
	area=PI*radius*radius;
	parameter=2*PI*radius;
	printf("\nArea of Circle : %f",area);
	printf("\nParameter of the circle : %f",parameter);
	
}
