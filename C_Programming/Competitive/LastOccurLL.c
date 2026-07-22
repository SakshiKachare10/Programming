/*
    Last Occurrence Position
    Return position of last occurrence.
*/

#include <stdio.h>
#include <stdlib.h>

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

int LastOccur(PNODE first, int No)
{
    int iPos = 1 ,iLastPos = 1;

    while(first != NULL) // Type 1 
    {
        if(first->data == No)
        {
            iLastPos = iPos;
        }
        first = first -> next;
        iPos++;
    }
    return iLastPos;
}

int main()
{
    PNODE head = NULL;
    int iRet = 0;
    
    InsertLast(&head,11);
    InsertLast(&head,10);
    InsertLast(&head,20);
    InsertLast(&head,21);
    InsertLast(&head,20);

    iRet = LastOccur(head,20);
    printf("Position is: %d",iRet);

    return 0;
}