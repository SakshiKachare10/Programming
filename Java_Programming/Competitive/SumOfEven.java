/*
   Write a program to find the sum of all even numbers up to N
*/
class Logic
{
    void sumEvenNumbers(int n)
    {
        int iCnt = 0 , iSum = 0;
        for(iCnt = 1; iCnt <= n; iCnt++)
        {
            if(iCnt % 2 == 0)
            {
                iSum = iSum + iCnt;
            }
        }
        System.out.println(iSum+" is the Sum of Even Numbers");

    }
}
class SumOfEven
{
    public static void main(String A[]) 
    {
        Logic lobj = new Logic();
        lobj.sumEvenNumbers(10);
    }
}