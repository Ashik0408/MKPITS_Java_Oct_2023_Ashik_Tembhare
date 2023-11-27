#include<stdio.h>
#include<conio.h>

int menu();

int main()
{
	int total=0;
	printf("Welcome to >>>>>>>\n");
//	printf("Do you want to Book Room :- y/n \n");
	
	printf("")
	
	total =menu();
	printf("Total :-%d",&total);
}

int menu()
{
	int orderNo,qty,rate,teaTotal=0;
	printf("Food Menu \n 1.Tea \n 2.Coffee \n 3.Samosa \n 4.Maharastrian Thali \n");
			scanf("%d",&orderNo);
			
			switch(orderNo)
			{
				case 1:
					printf("\nYou have selected Tea.\n Enter the quantity :");
   					scanf("%d",&qty);
    				rate=5;
    				teaTotal=qty*rate;
    				break;
			}
	return teaTotal;
}
