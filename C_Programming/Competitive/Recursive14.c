/*
    Write a recursive program which accept number from user
    and return its factorial

    Input : 5
    Output : 120
*/

#include<stdio.h>

int Fact(int iNo)
{
    int iMult = 1, i = 0;

    for(i = 1; i <= iNo ; i++)
    {
        iMult = iMult * i;
    }
    return iMult;

}
int main()
{
    int iValue = 0, iRet = 0;

    printf("Enter Number: \n");
    scanf("%d",&iValue);

    iRet = Fact(iValue);

    printf("%d",iRet);

    return 0;
}