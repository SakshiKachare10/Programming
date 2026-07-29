/*
    Write a recursive program which accept string from user and count white 
    spaces. 
    Input : HE llo WOr lD 
    Output : 3 

*/
#include<stdio.h>

int WhiteSpace(char *str) 
{ 
    int iCnt = 0;
    while(*str != '\0')
    {
        if(*str == ' ')
        {
            iCnt++;
        }
        str++;
    }
    return iCnt;
} 

int main()
{
    int iRet = 0;
    char arr[20];
    printf("Enter String: \n");
    scanf("%[^\n]s",arr);

    iRet = WhiteSpace(arr);
    printf("Number of white spaces are : %d",iRet);

    return 0;
}