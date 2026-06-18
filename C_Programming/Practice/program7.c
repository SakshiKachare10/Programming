#include<stdio.h>

int main()
{
    float fValue1=0.0f;          // To store First input
    float fValue2=0.0f;          // To store Second input
    float fResult=0.0f;          // To store Result

    printf("Enter 1st No:\n");
    scanf("%f",&fValue1);

    printf("Enter 1st No: \n");
    scanf("%f",&fValue2);

    fResult = fValue1+fValue2;    // Perform the Addition
    
    printf("Addition is: %f\n",fResult);  

    return 0;

}