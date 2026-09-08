import java.io.*;
import java.util.*;

class program731
{
    public static void main(String A[]) throws Exception
    {
        Scanner sobj = new Scanner(System.in);
        String PackFileName = null;
        File fPackobj = null;
        FileInputStream fiobj = null;
        byte Header[] = new byte[100];
        String strHeader = null;
        String Tokens[] = null;
        File NewFile = null;

        System.out.println("Enter the name of packed file");
        PackFileName = sobj.nextLine();

        fPackobj = new File(PackFileName);

        if(fPackobj.exists())
        {
            fiobj = new FileInputStream(fPackobj);

            fiobj.read(Header,0,100);

            strHeader = new String(Header);

            System.out.println("Header is :"+strHeader);

            strHeader = strHeader.trim();
            strHeader = strHeader.replaceAll("\\s+", " ");

            Tokens = strHeader.split(" ");

            System.out.println("File name : "+Tokens[0]);
            System.out.println("File size : "+Tokens[1]);

            NewFile = new File(Tokens[0]);
            NewFile.createNewFile();
        }
        else
        {
            System.out.println("There is no such packed file");
        }

    }
}