/*
   Write a recursive program which accept number from user and return 
    smallest digit 
    Input : 87983 
    Output : 3 
*/

#include<stdio.h>

int Min(int iNo) 
{ 
    int iDigit = 0 , iAns = 9;

    if(iNo < 0)
    {
        iNo = -iNo;
    }

    while(iNo != 0)
    {
        iDigit = iNo % 10;
        if(iDigit < iAns)
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

    iRet = Min(iValue);
    printf("Smallest digit is: %d",iRet);

    return 0;
}