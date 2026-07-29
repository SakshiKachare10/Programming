/*
    Write a recursive program which accept string from user and count number 
    of characters. 
    Input : Hello 
    Output : 5
*/
#include<stdio.h>

int Strlen(char *str) 
{ 
    int i = 0;
    while(*str != '\0')
    {
        i++;
        str++;
    }
    return i;
} 
int main() 
{ 
    int iRet = 0; 
    char arr[20]; 
    printf("Enter string: \n"); 
    scanf("%s",arr); 
    iRet = Strlen(arr); 
    printf("%d",iRet); 
    return 0; 
}