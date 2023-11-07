#include<stdio.h>
#include<conio.h>

main()
{
	char c;
	int total=0,a,b;
	printf("Enter ur choice A ,B, C, D :-");
	scanf("%c",&c);
	printf("Enter a :-");
	scanf("%d",&a);
	printf("Enter b :-");
	scanf("%d",&b);
	

	
	switch(c)
	{
		case 'A' :
			total=a+b;
			break;
		
		case 'B' :
			total=a-b;
			break;
			
		case 'C' :
			total=a*b;
			break;
			
		
	}
	printf("total :-%d",total);
	
}
