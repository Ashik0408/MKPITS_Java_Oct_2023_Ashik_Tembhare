#include<stdio.h>
#include<conio.h>

main()
{
	float leng1,leng2,leng3;
	printf("Enter the 1st side of Tringle...:- ");
	scanf("%f",&leng1);
	printf("Enter the 2nd side of Tringle...:- ");
	scanf("%f",&leng2);
	printf("Enter the 3rd side of Tringle...:- ");
	scanf("%f",&leng3);
	
	if(leng1==leng2 && leng1==leng3 && leng2==leng3)
	printf("Equilateral Triengle..");
	else if(leng1==leng2 || leng1==leng3 || leng2==leng3)
	printf("Isoscaler triengle...");
	else
	printf("Scaler triengglr....");
	
	getch();
}
