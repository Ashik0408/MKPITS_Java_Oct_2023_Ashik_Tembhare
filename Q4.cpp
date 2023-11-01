#include<stdio.h>
#include<conio.h>
main()
{
	int p,c,m,avg,total;
	printf("Enter the marks of all subjects...\n");
	printf("Enter Phy marks :- ");
	scanf("%d",&p);
	printf("Enter Chem marks :- ");
	scanf("%d",&c);
	printf("Enter Math marks :- ");
	scanf("%d",&m);
	total=p+c+m;
	avg=total/3;
	if((p>=50&& c>=50 && m>=50) || avg>=60)
	{
		printf("Result PASS...");
		
	}
	else
	printf("Result Fail..");
	
	getch();
}
