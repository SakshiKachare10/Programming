/*
    Write a recursive program which accept number from user and return its  
    product of digits.  
    Input :  523 
    Output :  30 
*/ 

#include<stdio.h>

int Mult(int iNo) 
{ 
   int iMult = 1, iCnt = 0 , iDigit = 0;

   while(iNo != 0)
   {
        iDigit = iNo % 10;
        iMult = iMult * iDigit;
        iNo = iNo / 10;
   }
   return iMult;
} 

int main() 
{ 
    int iValue = 0, iRet = 0; 
    printf("Enter number :\n"); 
    scanf("%d",&iValue); 
    iRet = Mult(iValue); 
    printf("%d",iRet); 
    return 0; 
} 