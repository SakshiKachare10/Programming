class program701
{
    public static void main(String a[]) 
    {
        String Header = "marvellous";

        System.out.println(Header);

        Header = Header.replaceAll("l", "L"); // ISSUE RESOLVED

        System.out.println(Header);

    }
}