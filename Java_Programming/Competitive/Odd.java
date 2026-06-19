/*
    Write a program to print all odd numbers up to N
*/
class Logic
{
    void printOddNumbers(int n)
    {
        int iCnt = 0;
        for(iCnt = 1; iCnt <= n; iCnt++)
        {
            if(iCnt % 2 != 0)
            {
                System.out.println(iCnt+"\t");
            }
        }

    }
}
class Odd
{
    public static void main(String A[]) 
    {
        Logic lobj = new Logic();
        lobj.printOddNumbers(20);
    }
}