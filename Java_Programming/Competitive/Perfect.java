/*
  Write a program to check whether a number is a perfect number or not
*/
class Logic
{
    void checkPerfect(int num)
    {
        int iCnt = 0 , iFact = 0;
        for(iCnt = 1; iCnt < num; iCnt++)
        {
            if(num % iCnt == 0)
            {
               iFact = iFact + iCnt;
            }
        }

        if(iFact == num)
        {
            System.out.println(num+" is Prefect Number");
        }
        else
        {
            System.out.println(num+" is not Prefect Number");
        }
        
    }
}
class Perfect
{
    public static void main(String A[]) 
    {
        Logic lobj = new Logic();
        lobj.checkPerfect(6);
    }
}