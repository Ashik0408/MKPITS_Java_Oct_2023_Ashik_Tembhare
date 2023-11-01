#include<stdio.h>
#include<conio.h>

main()
{
	char c;
	printf("Enter your charecter :- ");
	scanf("%c",&c);
	
	if(c>=65 && c<=90)
	printf("Capital Letter ..");
	else if (c>=97 && c<=122)
	printf("Small Letter ");
	else if (c>=45 && c<=57)
	printf("It is a Number ");
	else 
	printf("It is a special symbol...");
	
	getch();
	
	
}
