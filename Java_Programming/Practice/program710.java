class program710
{
    public static void main(String a[]) 
    {
        String Header = "India  is  my  country";

        String Arr[] = Header.split(" "); 

        System.out.println("number of words are : "+Arr.length); // ISSUE
    }
}