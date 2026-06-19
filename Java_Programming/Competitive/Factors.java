/*
   Write a program to display all factors of a given number
*/
class Logic
{
    void displayFactors(int num)
    {
        int iCnt = 0;
        for(iCnt = 1; iCnt <= num ; iCnt++)
        {
            if(num % iCnt == 0)
            {
                System.out.println(iCnt);
            }
        }
       
      
        
    }
}
class Factors
{
    public static void main(String A[]) 
    {
        Logic lobj = new Logic();
        lobj.displayFactors(12);
    }
}