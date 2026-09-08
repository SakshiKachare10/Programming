class program711
{
    public static void main(String a[]) 
    {
        String Header = "India  is  my  country";

        String Arr[] = Header.split(" "); 

        System.out.println("number of words are : "+Arr.length); 
        
        for(int i = 0; i < Arr.length; i++)
        {
            System.out.println(Arr[i]);
        }
    }
}