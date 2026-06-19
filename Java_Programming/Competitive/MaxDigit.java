/*
   Write a program to find the largest digit in a given number
*/
class Logic
{
    void findLargestDigit(int num)
    {
        int iDigit = 0 , iMax = 0 ;
        while(num != 0)
        {
            iDigit = num % 10;
            if(iDigit > iMax)
            {
                iMax = iDigit;
            }
            
            num = num / 10;

        }
        System.out.println(iMax+" is the largest digit");

        
    }
}
class MaxDigit
{
    public static void main(String A[]) 
    {
        Logic lobj = new Logic();
        lobj.findLargestDigit(83429);
    }
}