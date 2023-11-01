#include<stdio.h>
#include<conio.h>
main()
{
	int a,b;
	printf("Enter your 1st value :- ");
	scanf("%d",&a);
	printf("Enter your 2nd value :- ");
	scanf("%d",&b);
	
	a=a+b;
	b=a-b;
	a=a-b;
	
	
	printf("swap value 1st  :- %d \n",a);
	printf("swap value 2nd  :- %d ",b);
	
	getch();
	

}
