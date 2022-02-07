#include<stdio.h>
main ()
{
char *str[]={"Frogs" , "Do" , "Not", "Die", "They", "Croak!"};
printf("\n %d %d ",sizeof(str), sizeof(str[0]));
}