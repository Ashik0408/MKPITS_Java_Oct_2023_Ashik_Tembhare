#include<stdio.h>
#include<conio.h>

main()
{
	float f,c;
	printf("Enter the Tempreture in fahrenheit :- ");
	scanf("%f",&f);
	
	c=(f-32)*5/9;
	
	printf("Tempreture in celsius :- %f",c);
	
	getch();
	
}
