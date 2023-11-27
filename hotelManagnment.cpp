#include<stdio.h>
#include<conio.h>

int main()
{
	char bookRoom,orderContinue;
	int i=1,count=1,orderNo,qty,rate,teaTotal;
	
	printf("Welcome to >>>>>>>\n");
	printf("Do you want to Book Room :- y/n \n");
	scanf("%c",&bookRoom);
	if(bookRoom=='y')
	{
		printf("Please Collect Your keys from Reception \n");
		printf("Welcome To Shri Hotel....Your Room has been Booked \n");
		
		while(count>=i)
		{
			printf("Food Menu \n 1.Tea \n 2.Coffee \n 3.Samosa \n 4.Maharastrian Thali \n");
			scanf("%d",&orderNo);
			
			switch(orderNo)
			{
				case 1:
					printf("\nYou have selected Tea.\n Enter the quantity :");
   					scanf("%d",&qty);
    				rate=5;
    				teaTotal=qty*rate;
			}
			printf("Do you want to continue your order :y/n \n");
			scanf("%c",&orderContinue);
			
			if(orderContinue=='y')
			{
				i=count+1;
			}
			
			
		}
	}
	
		
	
	printf("Total Food Amt :-%d",teaTotal);
}
