#include<stdio.h>
#include<conio.h>
int main()
{
	char name[20],email[20],user_id[20];
	char u[20]="mkpits";
	int mob_no,pass,c_pass,v1,v2;
	
	printf("Enter Your Name :- ");
	scanf("%s",&name);
	printf("Enter Your Email :- ");
	scanf("%s",&email);
	printf("Enter Your User_ID :- ");
	scanf("%s",&user_id);
	printf("Enter Your Mobile No :- ");
	scanf("%d",&mob_no);
	printf("Enter Your Password :- ");
	scanf("%d",&pass);
	printf("Enter Your Confirm Password :- ");
	scanf("%d",&c_pass);
	
	if(strcmp(user_id,u))
	{
		v2=strcmp(pass,c_pass);
		if(v2==0)
		printf("Welcom");
		else
		printf("bhgg");
	}
	else
	printf("bhurrr");
	getch();
	return 0;
	
	
}
