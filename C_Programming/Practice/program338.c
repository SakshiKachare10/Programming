#include<stdio.h>

typedef unsigned int UINT;

// Position : 13

int main()
{
    UINT iNo = 0;
    UINT iMask = 0xFFFFEFFF;
  
    printf("Enter Number: ");
    scanf("%d",&iNo);

    iNo = iNo & iMask;

    printf("Updated Number: %d\n",iNo);

    return 0;
}