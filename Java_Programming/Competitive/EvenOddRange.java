/*
   Write a program to count how many even and odd numbers are present between 1 and N.
*/
class Logic
{
    void countEvenOddRange(int n)
    {
        int iCountE = 0 , iCountO = 0 , iCnt = 0;
        for(iCnt = 1; iCnt <= n ; iCnt++)
        {
            if(iCnt % 2 == 0)
            {
               iCountE++;
            }
            else
            {
               iCountO++;
            }
        }
        System.out.println(iCountE+ " is the count of even numbers");
        System.out.println(iCountO+ " is the count of odd numbers");
        
    }
}
class EvenOddRange
{
    public static void main(String A[]) 
    {
        Logic lobj = new Logic();
        lobj.countEvenOddRange(50);
    }
}