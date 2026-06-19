/*
   Write a program to find the sum of even and odd digits separately in a number
 */
class Logic
{
    int sumEvenOddDigits(int n)
    {
        int digit = 0 ,iSum1 = 0, iSum2 = 0;
        
        while(n != 0)
        {
            digit = n % 10;

            if(digit % 2 == 0)
            {
                iSum1 = iSum1 + digit;
            }
            else
            {
                iSum2 = iSum2 + digit;
            }
            n = n / 10;
        }
        return iSum1 - iSum2;

    }
}
class Even_Odd
{
    public static void main(String A[]) 
    {
        Logic lobj = new Logic();
        System.out.println(lobj.sumEvenOddDigits(123456));
      
    }
}