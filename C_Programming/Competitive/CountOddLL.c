/*
    Count Odd Numbers 
    Count nodes containing odd values
*/
#include <stdio.h>
#include<stdlib.h>

#pragma pack(1)
struct node
{
    int data;
    struct node * next; 
};

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

int CountOdd(PNODE first)
{
    int iCount = 0;
    while(first != NULL) // Type 1
    {
        if(first->data % 2 != 0)
        {
           iCount++;
        }
        
        first = first -> next;
    }
    return iCount;
}


int main()
{
    PNODE head = NULL;
    int iRet = 0;
    
    InsertLast(&head,11);
    InsertLast(&head,10);
    InsertLast(&head,21);
    InsertLast(&head,7);

    Display(head);

    iRet = CountOdd(head);
    printf("Number of Odd elements are: %d\n",iRet);


    return 0;
}