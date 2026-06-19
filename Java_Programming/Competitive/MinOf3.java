class Logic
{
    void findMin(int a, int b, int c)
    {
        if(a < b && a < c) 
        {
            System.out.println(a+" is minimum");
        }
        else if(b > a && b < c)
        {
            System.out.println(b+" is minimum");
        }
        else
        {
            System.out.println(c+" is minimum");
        }

    }
}
class MinOf3
{
    public static void main(String A[]) 
    {
        Logic lobj = new Logic();
        lobj.findMin(3, 7, 2);

        
    }
}