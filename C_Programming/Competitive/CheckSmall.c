/*
   Accept Character from user and check whether it is small case or 
   not (a-z)
*/
#include<stdio.h>

#define TRUE 1
#define FALSE 0

typedef int BOOL;

BOOL ChkSmall(char ch)
{
    if((ch >= 'a' && ch <= 'z'))
    {
        return TRUE;
    }
    return FALSE;

}
int main()
{
    char cValue = '\0';
    BOOL bRet = FALSE;

    printf("Enter the Character :");
    scanf("%c",&cValue);

    bRet = ChkSmall(cValue);

    if(bRet == TRUE)
    {
        printf("It is Small Character");
    }
    else
    {
        printf("It is not a Small Character");
    }

    return 0;
}