#include<stdio.h>

int DollarToINR(int iNo)
{
   int iCnt = 0;
   for(iCnt = 1; iCnt <= iNo; iCnt++)
   {
      if(iNo == 70)
   }
}  
int main()
{
    int iValue = 0, iRet = 0;
    printf("Enter Number of USD: ");
    scanf("%d",&iValue);

    iRet = DollarToINR(iValue);
    printf("Value iin INR is %d",iRet);

    return 0;
}