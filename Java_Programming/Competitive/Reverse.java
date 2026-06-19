/*
  Write a program to print numbers from N down to 1 in reverse order.
*/
class Logic
{
    void printReverse(int n)
    {
        int iCnt = 0;
        for(iCnt = n; iCnt >= 1; iCnt--)
        {
            System.out.println(iCnt);
        }
        
    }
}
class Reverse
{
    public static void main(String A[]) 
    {
        Logic lobj = new Logic();
        lobj.printReverse(10);
    }
}