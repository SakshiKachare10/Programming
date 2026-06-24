/*
  Write a program which accept string from user and copy the 
  contents of that string into another string. (Implement strcpy() 
  function) 
*/
#include<stdio.h>
#include<string.h>

void StrCpyX(char *src,char *dest)
{
    if(src == NULL || dest == NULL)
    {
        return;
    }

    while(*src != '\0')
    {
        *dest = *src;
        src++;
        dest++;
    }
    *dest = '\0';
}


int main()
{
    char arr[30] = "Sakshi Kachare";
    char brr[30];

    StrCpyX(arr,brr);
    printf("%s\n",brr);

    strcpy(arr,brr);
    printf("%s",brr);

    return 0;
}