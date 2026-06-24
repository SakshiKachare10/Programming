/*
   Write a program which accept string from user and copy the 
   contents of that string into another string. (Implement strncpy() 
   function)
*/
#include<stdio.h>
#include<string.h>

void StrNCpyX(char *src,char *dest, int iCnt)
{
    if(src == NULL || dest == NULL)
    {
        return;
    }

    while((*src != '\0') && (iCnt != 0))
    {
        *dest = *src;
        src++;
        dest++;
        iCnt--;
    }
    *dest = '\0';
}


int main()
{
    char arr[30] = "Sakshi Kachare";
    char brr[30];  // empty String


    StrNCpyX(arr,brr,7);
    printf("%s\n",brr);

    strncpy(arr,brr,7);
    printf("%s",brr);

    return 0;
}