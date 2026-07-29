/*
    Write a recursive program which accept number from user and return its 
    reverse number

    Input  :  523 
    Output :  325 
*/

#include<stdio.h>

int Reverse(int iNo)
{
    int iDigit = 0;
    while(iNo != 0)
    {
       iDigit = iNo % 10;
       printf("%d",iDigit);
       iNo = iNo / 10;         
    }
}

int main()
{
    int iValue = 0;

    printf("Enter Number : \n");
    scanf("%d",&iValue);

    Reverse(iValue);
    
    return 0;
}