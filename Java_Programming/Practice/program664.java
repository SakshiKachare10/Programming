import java.io.*;
import java.util.*;

class program664
{
    public static void main(String A[]) throws IOException
    {
        FileWriter fwobj = new FileWriter("Demo.txt"); //filewrite create file if it is not present

        fwobj.write("Jay Ganesh...");

        fwobj.close(); // IMPORTANT if we dont call close data will be not eritten in file
    }    
}