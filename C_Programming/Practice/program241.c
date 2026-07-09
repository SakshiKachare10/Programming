#include<stdio.h>

int main()
{
  char Arr[50] = {'\0'};

  printf("Enter String :\n");
  scanf("%[^'\n]s",Arr);      // when enter \n it stops ( it doesnt stop at space ) -regets -Special scanf       

  printf("Entered String is: %s\n",Arr);

   
  return 0;
}