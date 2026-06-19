/*
   Write a program to check whether a number is prime or not.
*/
class Logic
{
    void checkPrime(int num)
    {
        int iCnt = 0 , iCount = 0;
    
        for(iCnt = 1; iCnt <= num; iCnt++)
        {
            if(num % iCnt == 0)
            {
                iCount++;
            }
           
        }
        if(iCount == 2)
        {
            System.out.println(num+" is Prime number");
        }
        else
        {
            System.out.println(num+" is not Prime number");
        }
      
    }
}

class Prime
{
    public static void main(String A[]) 
    {
        Logic lobj = new Logic();
        lobj.checkPrime(11);
        
    }
}