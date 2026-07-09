#include<stdio.h>

int main()
{
  char Arr[50] = {'\0'};

  printf("Enter String :\n");
  scanf("%s",Arr);            // scanf accept data still space // Issue

  printf("Entered String is: %s\n",Arr);

   
  return 0;
}