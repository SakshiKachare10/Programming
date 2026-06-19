class Logic
{
    void checkPallindrome(int num)
    {
        int iDigit = 0 , irev = 0;
        int Onum = num;
        while(num != 0)
        {
            iDigit = num % 10;
            irev = irev * 10 + iDigit;
            num = num / 10;
        }

        if(Onum == irev)
        {
            System.out.println("number is pallindrome");
        }
        else
        {
            System.out.println("number is not pallindrome");
        }
        
    }
}

class Pallindrome
{
    public static void main(String A[])
    {
        Logic lobj = new Logic();
        lobj.checkPallindrome(121);
    }

}