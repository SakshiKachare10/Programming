class Logic
{
    void findMax(int a , int b)
    {
        if(a > b)
        {
            System.out.println(a + " is maximum");
        }
        else
        {
           System.out.println(b +" is maximum");
        }

    }
}

class Max
{
    public static void main(String A[]) 
    {
        Logic lobj = new Logic();
        lobj.findMax(20,15);
        
    }
}