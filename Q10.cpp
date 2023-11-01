#include<stdio.h>
#include<conio.h>

main()
{
	int no1,no2,no3;
	printf("Enter Number 1:- ");
	scanf("%d",&no1);
	printf("Enter Number 2:- ");
	scanf("%d",&no2);
	printf("Enter Number 3:- ");
	scanf("%d",&no3);
	if(no1>no2 && no1>no3)
	printf("Number 1 is gretest..");
	if(no2>no1 && no2>no3)
	printf("Number 2 is gretest..");
	if(no3>no1 && no3>no2)
	printf("Number 3 is gretest..");
	
	getch();
}
