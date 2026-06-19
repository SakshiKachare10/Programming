/*
   Write a program to find the smallest digit in a given number
*/
class Logic
{
    void findSmallestDigit(int num)
    {
        int iDigit = 0 , iMin = 9;
        while(num != 0)
        {
            iDigit = num % 10;
            if(iDigit < iMin )
            {
                iMin = iDigit;
            }
            
            num = num / 10;

        }

        System.out.println(iMin+" is the Smallest Digit");
    }
}
class MinDigit
{
    public static void main(String A[]) 
    {
        Logic lobj = new Logic();
        lobj.findSmallestDigit(45872);
    }
}