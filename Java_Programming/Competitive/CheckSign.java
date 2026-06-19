/*
    Write a program to check whether a number is positive, negative, or zero.
 */
class Logic
{
    void checkSign(int num)
    {
        if(num < 0)
        {
            System.out.println("Negative");
        }
        else if(num == 0)
        {
            System.out.println("Zero");
        }
        else
        {
            System.out.println("Positive");
        }
    }
}
class CheckSign 
{
    public static void main(String A[]) 
    {
        Logic lobj = new Logic();
        lobj.checkSign(-8);
        
    }

    
}