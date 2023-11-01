#include<stdio.h>
#include<conio.h>

main()
{
	float eu;
	printf("Enter the Electric Unit :-");
	scanf("%f",&eu);
	
	if(eu<100)
	printf("Total Bill :-%f ",eu*1.0);
	else if(eu>=100 && eu<200)
	printf("Total Bill :-%f ",eu*1.25);
	else if(eu>=200 && eu<300)
	printf("Total Bill :-%f ",eu*1.50);
	else if(eu>=300 && eu<400)
	printf("Total Bill :-%f ",eu*1.75);
	else
	printf("Total Bill :-%f ",eu*2);
	
	getch();
}
