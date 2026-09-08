class program721
{
    public static void main(String a[]) 
    {
        String Header = "A.txt 10";

        System.out.println("Actual Header length : "+Header.length()); // 8

        System.out.println("Number of white spaces we need : "+(100 - Header.length())); // 11

        int size = 100 - Header.length();

        for(int i = 1; i <= size; i++)
        {
            Header = Header + " ";
            System.out.println(i);
        }

        System.out.println("Updated Header length is : "+Header.length());
    }
}