/*
   Write a program which accept string from user and accept one 
   character. Return index of last  occurrence of that character
*/
#include<stdio.h>

int FirstChar(char *str,char ch)
{
    int index = 0;
    int LastPos = -1;
   
    while(*str != 0)
    {
        if(*str == ch)
        {
            LastPos = index;
        }
        str++;
        index++;
    }

    return LastPos;
    
}
int main()
{
    char arr[20];
    char cValue;
    int iRet = 0;

    printf("Enter String: ");
    scanf("%[^\n]s",arr);

    printf("Enter the Character: ");
    scanf(" %c",&cValue);

    iRet = FirstChar(arr,cValue);

    printf("Character Location is : %d",iRet);

    return 0;
}