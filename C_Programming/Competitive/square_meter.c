/*Write a program which accept area in square feet and convert it into square 
meter(1 square feet = 0.0929 Square meter)
*/

#include<stdio.h>

double SquareMeter(int iValue) 
{ 
    double Area = 0.0;

    return Area = iValue * 0.0929;
}

int main()
{
    int iValue = 0; 
    double dRet = 0.0;

    printf("Enter area in Square feet: "); 
    scanf("%d",&iValue);
    
    dRet = SquareMeter(iValue);

    printf("Area of Square meter is : %lf",dRet);

    return 0;

}