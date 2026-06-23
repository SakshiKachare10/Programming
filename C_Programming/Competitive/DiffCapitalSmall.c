/*
   Write a program which accept string from user and return 
   difference between frequency of small characters and frequency of 
   capital characters
*/
#include<stdio.h>

int Difference(const char *str)
{
   int iCountC = 0 , iCountS = 0;

   while(*str != '\0')
   {
      if(*str >= 'A' && *str <= 'Z')
      {
         iCountC++;
      }
      else if(*str >= 'a' && *str <= 'z')
      {
         iCountS++;     
      }
      str++;
   }
   return iCountS - iCountC;
   
}
int main()
{
    char arr[20];
    int iRet = 0;

    printf("Enter String: ");
    scanf("%[^'\n']",arr);

    iRet = Difference(arr);

    printf("%d",iRet);

    return 0;

}