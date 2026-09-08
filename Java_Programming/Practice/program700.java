class program700
{
    public static void main(String a[]) 
    {
        String Header = "marvellous";

        System.out.println(Header);

        Header.replaceAll("l", "L"); // ISSUE

        System.out.println(Header);

    }
}