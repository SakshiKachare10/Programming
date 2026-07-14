#include<iostream>
using namespace std;

#pragma pack(1)
class ArrayX
{
    public:
       int *Arr;
       int iSize;

       // Parameterized Constructor
       ArrayX(int X)
       {
          cout<<"Inside Constructor"<<endl;
          iSize = X;               // Characteristics initialization
          Arr = new int[iSize];    // Resource Allocation
          
       }

       // Destructor
       ~ArrayX()
       {
            cout<<"Inside Destructor"<<endl;
            delete []Arr;           // Resource Deallocation

       }

};

int main()
{
    // Static memory allocation for object
    //ArrayX aobj1(5);  

    ArrayX *aobj1 = new ArrayX(5);
    delete aobj1;

    cout<<"End of main"<<endl;
    
    return 0;
}