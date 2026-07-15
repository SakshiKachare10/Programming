#include<stdio.h>

typedef unsigned int UINT;

// Position : 4

int main()
{
    UINT iNo = 0;
    UINT iMask = 0xFFFFFFF7;
  
    printf("Enter Number: ");
    scanf("%d",&iNo);

    iNo = iNo & iMask;

    printf("Updated Number: %d\n",iNo);

    return 0;
}