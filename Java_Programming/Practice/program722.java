class program722
{
    public static void main(String a[]) 
    {
        String Header = "Hello.txt 1078";

        System.out.println("Actual Header length : "+Header.length()); // 14

        System.out.println("Number of white spaces we need : "+(100 - Header.length())); 

        int size = 100 - Header.length();

        for(int i = 1; i <= size; i++)
        {
            Header = Header + " ";
        }

        System.out.println("Updated Header length is : "+Header.length());
        System.out.println("Updated Header is : "+Header);
    }
}