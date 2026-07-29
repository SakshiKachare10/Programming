/*
    Write a recursive program which accept number from user and return 
    largest digit 
    Input : 87983 
    Output : 9 
*/
#include<stdio.h>

int Max(int iNo) 
{ 
    int iDigit = 0 , iAns = 0;

    if(iNo < 0)
    {
        iNo = -iNo;
    }

    while(iNo != 0)
    {
        iDigit = iNo % 10;
        if(iDigit > iAns)
        {
            iAns = iDigit;
        }
        iNo = iNo / 10;
    } 
    return iAns;
} 

int main()
{
    int iValue = 0 , iRet = 0;

    printf("Enter Number : \n");
    scanf("%d",&iValue);

    iRet = Max(iValue);
    printf("Largest digit is: %d",iRet);

    return 0;
}