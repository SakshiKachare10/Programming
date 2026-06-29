#include<stdio.h>
#include<stdlib.h>

int SumEven(int Arr[],int iSize)
{
    int iSum = 0 , iCnt = 0;

    for(iCnt = 0; iCnt< iSize; iCnt++)
    {
        if(Arr[iCnt] % 2 == 0)
        {
           iSum = iSum + Arr[iCnt];
        }
    }
    return iSum;
    

}
int main()
{
    int *Brr = NULL;
    int iLength = 0 , iCnt = 0, iRet = 0;

    printf("Enter the number of Elements: ");
    scanf("%d",&iLength);

    Brr= (int *)malloc(sizeof(int) * iLength);

    printf("Enter the Elements: ");

    for(iCnt = 0; iCnt< iLength ;iCnt++)
    {
        scanf("%d",&Brr[iCnt]);
    }

    iRet = SumEven(Brr,iLength);
    printf("Summation of Even Elements are : %d\n",iRet);

    free(Brr);

    return 0;
}