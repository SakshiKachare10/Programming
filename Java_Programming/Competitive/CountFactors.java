/*
   Write a program to count total number of factors of a given number
*/
class Logic
{
    void countFactors(int num)
    {
        int iCnt = 0 , iCount = 0;
        for(iCnt = 1; iCnt <= num ; iCnt++)
        {
            if(num % iCnt == 0)
            {
                iCount++;
            }
        }
        System.out.println(iCount+" is the total number of factors of given number");
       
      
        
    }
}
class CountFactors
{
    public static void main(String A[]) 
    {
        Logic lobj = new Logic();
        lobj.countFactors(20);
    }
}