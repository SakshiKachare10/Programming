/*
    Input : 10 20 30 10 30 40 10 40 10
    Value to search : 40
    Output : 6
*/

#include<iostream>
using namespace std;

template<class T>
int SearchFirst(T *arr, int iSize, T iNo)
{
    int i = 0;

    for(i = 0 ; i < iSize ; i++)
    {
        if(iNo ==  arr[i])
        {
            return i + 1;
        }
    }

}
int main()
{
    int arr[]={10,20,30,10,30,40,10,40,10};
    int iRet = SearchFirst(arr,9,40);
    cout<<iRet<<endl; // 6
    return 0;
}