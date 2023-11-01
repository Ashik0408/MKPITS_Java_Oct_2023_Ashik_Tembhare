#include<stdio.h>
#include<conio.h>
main()
{
	int marks;
	printf("Enter your marks out of 100 :- ");
	scanf("%d",&marks);
	if(marks>=50)
	printf("Your Pass...");
	else
	printf("Your Fail... ");
	getch();
	
}
