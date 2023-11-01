#include<stdio.h>
#include<conio.h>

main()
{
	int x,y;
	printf("Enter x :-");
	scanf("%d",&x);
	printf("Enter y :-");
	scanf("%d",&y);
	
	if(x>0 && y>=0)
	printf("1st");
	else if(x<0 && y>=0)
	printf("2nd");
	else if(x<0 && y<0)
	printf("3rd");
	else
	printf("4th");
	
	getch();
}
