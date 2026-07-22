/*
    Count Frequency of Given Number 
    Count how many times a number appears. 
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

void Display(PNODE first)
{
    while(first != NULL) // Type 1 
    {
        printf("| %d | -> ",first->data);
        first = first -> next;
    }
    printf("NULL\n");
}

int Frequency(PNODE first, int No)
{
    int iCount = 0;
    while(first != NULL) // Type 1
    {
        if(first->data == No)
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
    InsertLast(&head,10);
    InsertLast(&head,10);

    Display(head);

    iRet = Frequency(head,10);
    printf("Frequency of number is: %d\n",iRet);


    return 0;
}