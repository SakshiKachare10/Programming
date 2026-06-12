#include<stdio.h>

double CircleArea(float fRadius)
{
    float PI = 3.14f;
    double Area = 0.0;

    return Area = PI * fRadius * fRadius;
}
int main()
{
    float fValue = 0.0;
    double dRet = 0.0;

    printf("Enter radius: ");
    scanf("%f",&fValue);

    dRet = CircleArea(fValue);

    printf("Area of Circle is: %lf",dRet);

    return 0;


}