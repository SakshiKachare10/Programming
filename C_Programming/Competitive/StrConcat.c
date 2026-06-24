/*
   Write a program which 2 strings from user and concat second string 
   after first string. (Implement strcat() function).
*/
#include<stdio.h>
#include<string.h>

void StrCatX(char *src, char *dest)
{
    if(src == NULL || dest == NULL)
    {
        return;
    }

    while(*src != '\0')
    {
       src++;
    }

    while(*dest != '\0')
    {
        *src = *dest;
        src++;
        dest++;

    }

    *src = '\0';            
}
int main()
{
    char arr[50] = "Marvellous Infosystems";
    char brr[30] = "Logic Building";

    StrCatX(arr,brr);
    printf("%s\n",arr);

    strcpy(arr,"Marvellous Infosystems");

    strcat(arr,brr);
    printf("%s",arr);

    return 0;
}