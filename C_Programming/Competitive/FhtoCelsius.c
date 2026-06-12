/* Write a program which accept temperature in Fahrenheit and convert it into 
celsius. (1 celsius = (Fahrenheit -32) * (5/9))
*/

#include<stdio.h>

double FhtoCs(float fTemp) 
{ 
    double fCs = 0.0;
    return fCs = (fTemp - 32) * (5.0/9.0); // int/int division is zero
} 

int main() 
{ 
   float fValue = 0.0;
   double dRet = 0.0;

   printf("Enter temperature in Fahrenheit: "); 
   scanf("%d",&fValue); 

   dRet = FhtoCs(fValue); 

   printf("Conversion of Fahrenheit into Celsius is :%lf",dRet); 

   return 0; 
}