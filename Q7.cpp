#include<stdio.h>
#include<conio.h>

main()
{
	int wm,im;
	printf("Enter the Written Marks :-");
	scanf("%d",&wm);
	if(wm>=50)
	{
	printf("Enter the interview marks :-");
	scanf("%d",&im);
		if(im>=50)
		printf("Your Selected...");
		else
		printf("YOur not selected..");
	}
	else
	printf("Your not selected try again..");
	
	getch();
}
