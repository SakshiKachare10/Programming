/*
    Count Numbers Greater Than X
    Count elements greater than given number.
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

int CountGreater(PNODE first,int X)
{
    int iCount = 0;
    while(first != NULL) // Type 1
    {
        if(first->data > X)
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

    iRet = CountGreater(head,10);
    printf("Number of elements greater than X are: %d\n",iRet);


    return 0;
}