/*
  Accept character from user. If it is capital then display all the 
  characters from the input characters till Z. If input character is small 
  then print all the characters in reverse order till a. In other cases 
  return directly
*/

#include<stdio.h>

void Display(char ch)
{
   if(ch >= 'A' && ch <= 'Z')
   {
      for(; ch <= 'Z'; ch++)
      {
         printf("%c\t",ch);
      }
   }
   else if(ch >= 'a' && ch <= 'z')
   {
      for(; ch >= 'a'; ch--)
      {
         printf("%c\t",ch);
      }
   }

}

int main()
{
    char cValue = '\0';

    printf("Enter the Character: ");
    scanf("%c",&cValue);

    Display(cValue);

    return 0;
}