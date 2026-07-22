/*
   Search an Elemeny
   Check whether a number is present
*/
#include <stdio.h>
#include<stdlib.h>

#define TRUE 1
#define FALSE 0

#pragma pack(1)
struct node
{
    int data;
    struct node * next; 
};

typedef int BOOL;
typedef struct node NODE;
typedef struct node * PNODE;
typedef struct node ** PPNODE;

void InsertLast(PPNODE first, int iNo)
{
    PNODE newn = NULL;
    PNODE temp = NULL;

    newn = (PNODE)malloc(sizeof(NODE));

    newn->data = iNo;
    newn->next = NULL;

    if(*first == NULL)  // LL is Empty
    {
        *first = newn;
    }
    else               // LL contains atleast 1 node
    {
       temp = *first;

       while(temp -> next != NULL)  // Type 2
       {
          temp = temp -> next;
       }

       temp -> next = newn;
    }
}


void Display(PNODE first)
{
    while(first != NULL) // Type 1 
    {
        printf("| %d | -> ",first->data);
        first = first -> next;
    }
    printf("NULL\n");
} 

BOOL Search(PNODE first, int No)
{
    while(first != NULL)
    {
        if(first->data == No)   
        {
            return TRUE;
        }   
        
        first = first->next;
    }
    return FALSE;
}

int main()
{
    PNODE head = NULL;
    BOOL bRet = FALSE;
    
    InsertLast(&head,101);
    InsertLast(&head,111);
    InsertLast(&head,121);
    InsertLast(&head,151);

    Display(head);

    bRet = Search(head,111);

    if(bRet == TRUE)
    {
        printf("Element found\n");
    }
    else
    {
        printf("Element not found\n");
    }


    return 0;
}