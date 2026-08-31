import java.io.*;
import java.util.*;

class program684
{
    public static void main(String A[]) throws Exception
    {
        String FnameSrc = null;
        String FnameDest = null;

        File fobjSrc = null;
        File fobjDest = null;

        FileInputStream fiobj = null;
        FileOutputStream foobj = null;

        int iRet = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter source File name :");
        FnameSrc = sobj.nextLine();

        System.out.println("Enter Destination File name :");
        FnameDest = sobj.nextLine();

        fobjSrc = new File(FnameSrc);
        fobjDest = new File(FnameDest);

        fiobj = new FileInputStream(fobjSrc);
        foobj = new FileOutputStream(fobjDest);
        
        fobjDest.createNewFile();

        byte Buffer[] = new byte[100];

        if(fobjSrc.exists())
        {
            String str = null;

            while((iRet = fiobj.read(Buffer)) != -1)
            {
                foobj.write(Buffer,0,iRet);
            }
            
            fiobj.close();
            foobj.close();

        }
        else
        {
            System.out.println("There is no such file");
        }

    }    
}