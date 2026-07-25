#include<stdio.h>
#include<stdlib.h>

struct node
{
    int data;
    struct node *next;
    struct node *prev;
};

typedef struct node NODE;
typedef struct node * PNODE;
typedef struct node ** PPNODE;

void Display(PNODE first)
{}

void InsertFirst(PPNODE first, int iNo)
{
    PNODE newn = NULL;

    newn = (PNODE)malloc(sizeof(NODE));

    newn -> data = iNo;
    newn -> next = NULL;
    newn -> prev = NULL;   // $

    if(NULL == *first)     // LLL is Empty
    {
        *first = newn;
    }
    else
    {
        newn -> next = *first;
        (*first) -> prev = newn;   // $
        *first = newn; 
    }
}

void InsertLast(PPNODE first, int iNo)
{
    
    PNODE newn = NULL;

    newn = (PNODE)malloc(sizeof(NODE));

    newn -> data = iNo;
    newn -> next = NULL;
    newn -> prev = NULL;   // $

    if(NULL == *first)     // LLL is Empty
    {
        *first = newn;
    }
}

void InsertAtPos(PPNODE first, int iNo, int iPos)
{}

void DeleteFirst(PPNODE first)
{}

void DeleteLast(PPNODE first)
{}

void DeleteAtPos(PPNODE first,int iPos)
{}

int main()
{
    PNODE head = NULL;
    
    InsertFirst(&head,51);
    InsertFirst(&head,21);
    InsertFirst(&head,11);


    return 0;
}