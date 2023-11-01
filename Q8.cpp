#include<stdio.h>
#include<conio.h>
main()
{
	int marks;
	printf("Enter the Marks out of 100 ...:- ");
	scanf("%d",&marks);
	if(marks<50)
	printf("E");
	else if(marks>=50&& marks<60)
	printf("D");
	else if(marks>=60&& marks<70)
	printf("C");
	else if(marks>=70&& marks<80)
	printf("B");
	else
	printf("A");
	
	getch();
}
