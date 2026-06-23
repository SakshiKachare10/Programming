/*
   Write a program which accept string from user and display it inn 
   reverse order
*/
#include<stdio.h>

void Reverse(char *str)
{
    char *start = NULL; 
    char *end = NULL ;
    char temp = '\0';

    start = str;
     
    while (*str != '\0')
    {
        str++;
    }

    str--;
    end = str;

    while(start < end)
    {
        temp = *start;
        *start = *end;
        *end = temp;

        start++;
        end--;
    }
    
    
   
}

int main()
{
    char arr[100] = {'\0'};
    int iRet = 0;

    printf("Enter String: ");
    scanf("%[^\n]",arr);

    Reverse(arr);

    printf("Updated String is: %s ",arr);

    return 0;
}