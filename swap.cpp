#include<stdio.h>
#include<conio.h>
main()
{
	int a,b,c;
	printf("Enter your 1st value :- ");
	scanf("%d",&a);
	printf("Enter your 2nd value :- ");
	scanf("%d",&b);
	
	c=a;
	a=b;
	b=c;
	printf("swap value 1st  :- %d \n",a);
	printf("swap value 2nd  :- %d ",b);
	
	getch();
	

}
