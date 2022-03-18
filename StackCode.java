#include <stdio.h>
#define MAXSIZE 10



int Stack[MAXSIZE] , top = -1;



void Push();
void Pop();
void Display();



int main()
{
int choice;



do
{
printf("Enter 1 for push operation\n");
printf("Enter 2 for pop operation\n");
printf("Enter 3 for Display operation\n");
printf("Enter 4 for exit\n");



printf("\nEnter your choice : ");
scanf("%d", &choice);




switch(choice)
{
case 1:
Push();
break;
case 2:
Pop();
break;
case 3:
Display();
break;
case 4:
break;
default:
printf("Invalid choice.......\n");




}
}

while(choice != 4);
}





void Push()
{
int n;

if(top == MAXSIZE - 1)
{
printf("!!! Stack Overflow !!! \n");
}
else
{
printf("Enter a value : ");
scanf("%d", &n);
top++; //-> 0
Stack[top] = n;
}
}



void Pop()
{
if(top == -1)
{
printf("Stack Underflow!!!\n");
}
else
{
printf("Deleted value is: %d ", Stack[top]);
printf("\n");
top--;
}
}




void Display()
{
if(top == -1)
{
printf("Stack Underflow\n");
}
else
{
for(int i = 0; i <= top ; i++)
{
printf("%d ", Stack[i]);
}
}
}
