#include<stdio.h>
#include<conio.h>

int main()
{
	int total=0,a,b;
	int c;
	
	printf("Enter two No.\n \n");
	printf("Enter 1st No. :- ");
	scanf("%d",&a);
	printf("Enter 2nd No. :- ");
	scanf("%d",&b);
	printf("1>Addition \n 2>Substraction \n 3> Multiplication \n 4>Division \n");
	printf("Enter your choice :-");
	scanf("%d",&c);
	
	switch(c)
	{
		case 1 :
			total=a+b;
			break;
		case 2 :
			total=a-b;
			break;
		case 3 :
			total=a*b;
			break;
		case 4 :
			total=a/b;
			break;
		default:
			printf("Enter valid choice....\n");
			
	}
	printf("Your answer is  :- %d",total);
//	getch();
	return 0;
	
}
