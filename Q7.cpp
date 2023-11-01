#include<stdio.h>
#include<conio.h>

main()
{
	int wm,im;
	printf("Enter the Written Marks :-");
	scanf("%d",&wm);
	printf("Enter the interview marks :-");
	scanf("%d",&im);
	
	if(wm>=50)
		if(im>=50)
		printf("Your Selected...");
		else
		printf("YOur not selected..");
	else
	printf("Your not selected try again..");
	
	getch();
}
