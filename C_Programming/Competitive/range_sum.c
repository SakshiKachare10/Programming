/*Write a program which accept range from user and return addition of all numbers 
in between that range. (Range should contains positive numbers only) 
*/
#include<stdio.h>

int RangeSum(int iStart, int iEnd)
{
    int iCnt = 0 ,iSum = 0;
    if(iStart > iEnd || iStart <= 0 || iEnd <= 0)
    {
        printf("Invalid Range\n");
        return -1;
    }  

    for(iCnt = iStart; iCnt <= iEnd ; iCnt++)
    {
        iSum = iSum + iCnt;
    }
    return iSum;

}
int main()
{
    int iValue1 = 0;
    int iValue2 = 0;
    int iRet = 0;

    printf("Enter Starting point: ");
    scanf("%d",&iValue1);

    printf("Enter ending point: ");
    scanf("%d",&iValue2);

    iRet = RangeSum(iValue1,iValue2);

    if(iRet != -1)
    {
        printf("Addition is : %d",iRet);
    }
   

    return 0;
}