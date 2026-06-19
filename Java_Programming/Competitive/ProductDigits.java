/*
  Write a program to calculate the product of digits of a number
*/
class Logic
{
    void productOfDigits(int num)
    {
        int iDigit = 0 , iMult = 1;
        while(num != 0)
        {
            iDigit = num % 10;

            iMult = iMult * iDigit;

            num = num / 10;
        }
        System.out.println(iMult+ " is the Product of given number");
        
    }
}
class ProductDigits
{
    public static void main(String A[]) 
    {
        Logic lobj = new Logic();
        lobj.productOfDigits(234);
    }
}