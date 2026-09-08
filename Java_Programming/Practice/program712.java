class program712
{
    public static void main(String a[]) 
    {
        String Header = "India  is  my  country";

        Header = Header.trim();

        Header = Header.replaceAll("\\s+", " ");
        
        String Arr[] = Header.split(" "); 

        System.out.println("number of words are : "+Arr.length); 
        
        for(int i = 0; i < Arr.length; i++)
        {
            System.out.println(Arr[i]);
        }
    }
}