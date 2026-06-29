#include<stdio.h>

void Display(int Arr[],int iSize)
{
    int iCnt = 0;

    for(iCnt=0; iCnt < iSize; iCnt++)
    {
      printf("%d\n",Arr[iCnt]);
    }
   
}
int main()
{
    int iLength = 4;
    int Brr[iLength];  

    Brr[0] = 10;
    Brr[0] = 20;
    Brr[0] = 30;
    Brr[0] = 40;
  
    Display(Brr,iLength);

    return 0;

}

