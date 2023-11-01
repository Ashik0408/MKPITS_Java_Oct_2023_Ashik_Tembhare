#include<stdio.h>
#include<conio.h>
main()
{
	int wm,im;
	printf("Enter the Written Marks :-");
	scanf("%d",&wm);
	printf("Enter the interview marks :-");
	scanf("%d",&im);
	
	if(wm>=50 && im>=50)
	printf("Your not selected..");
	else
	printf("Your not selected try again..");
	
	getch();
}
