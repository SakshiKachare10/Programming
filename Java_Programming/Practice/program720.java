class program720
{
    public static void main(String a[]) 
    {
        String Header = "A.txt 10";

        System.out.println("Actual Header length : "+Header.length()); // 8

        System.out.println("Number of white spaces we need : "+(100 - Header.length())); // 11
    }
}