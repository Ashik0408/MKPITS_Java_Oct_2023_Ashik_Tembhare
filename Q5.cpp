#include<stdio.h>
#include<conio.h>

main()
{
	int year;
	printf("Enter year..:- ");
	scanf("%d",&year);
	if(year%4==0)
	printf("This is leap Year...");
	else if(year%100==0)
	printf("This is not leap Year...");
	else if(year%400==0)
	printf("This is leap year...");
	else 
	printf("This is not Leap Year...");
	
	getch();
}
