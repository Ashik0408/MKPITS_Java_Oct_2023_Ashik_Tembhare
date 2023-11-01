#include<stdio.h>
#include<conio.h>

main()
{
	int ang1,ang2,ang3;
	printf("Enter the 1st angel :- ");
	scanf("%d",&ang1);
	printf("Enter the 2nd angel :- ");
	scanf("%d",&ang2);
	printf("Enter the 3rd angel :- ");
	scanf("%d",&ang3);
	
	if((ang1+ang2+ang3)==180)
	printf("It is Triengle..");
	else
	printf("Its not a triengle..");
	
	getch();
}
