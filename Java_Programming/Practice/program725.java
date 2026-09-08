import java.io.*;
import java.util.*;

class program725
{
   public static void main(String A[]) throws Exception
   {
      int iRet = 0;
      int size = 0;
      int i = 0, j = 0;

      Scanner sobj = new Scanner(System.in);
      String FolderName = null;
      String PackFileName = null;
      String Header = "";

      FileOutputStream foobj = null;
      FileInputStream fiobj = null;

      System.out.println("Enter Folder name: ");
      FolderName = sobj.nextLine();

      System.out.println("Enter the name of packed file : ");
      PackFileName = sobj.nextLine();

      File fobjfolder = new File(FolderName);

      if((fobjfolder.exists()) && (fobjfolder.isDirectory())) // file asen aani folder asen tr
      {
         System.out.println("Folder Exists");

         File fobjPack = new File(PackFileName);
         fobjPack.createNewFile();                // pack file gets created

         foobj = new FileOutputStream(fobjPack);

         File fArr[] = fobjfolder.listFiles();

         System.out.println("Number of files in folder :"+fArr.length);

         byte Buffer[] = new byte[1024]; // it should be outside loop and byte b should small

         for(i = 0; i < fArr.length ; i++)
         {
            fiobj = new FileInputStream(fArr[i]);

            Header = Header + fArr[i].getName();
            Header = Header + " ";
            Header = Header + fArr[i].length();

            System.out.println("Header is :"+Header);

            size = 100 - Header.length();

            for(j = 1; j <= size ; j++)
            {
               Header = Header + " ";
            }
            System.out.println("Header length is : "+Header.length());
            // write file name and size


            /*// Loop to read from fiobj & write to foobj

            while((iRet = fiobj.read(Buffer)) != -1) 
            {
               foobj.write(Buffer,0,iRet);
            }*/

            fiobj.close();
            Header = "";
         }

         foobj.close();
         sobj.close();
         

      }
      else
      {
         System.out.println("There is no such Folder");
      }
            
   
   }    
}