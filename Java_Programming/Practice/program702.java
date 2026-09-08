class program702
{
    public static void main(String a[]) 
    {
        String Header = "    India  is  my  country    ";

        System.out.println(Header);

        Header = Header.trim(); 

        System.out.println(Header);

        Header = Header.replaceAll("  ", " ");

        System.out.println(Header);

    }
}