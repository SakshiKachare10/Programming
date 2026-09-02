import java.io.*;
import java.util.*;

class program691
{
   public static void main(String A[]) throws Exception
   {
      Scanner sobj = new Scanner(System.in);
      String FolderName = null;
      String PackFileName = null;

      FileOutputStream foobj = null;
      FileInputStream fiobj = null;

      int iRet = 0;

      System.out.println("Enter Folder name: ");
      FolderName = sobj.nextLine();

      System.out.println("Enter the name of packed file : ");
      PackFileName = sobj.nextLine();

      File fobjfolder = new File(FolderName);

      if((fobjfolder.exists()) && (fobjfolder.isDirectory()))
      {
         System.out.println("Folder Exists");

         File fobjPack = new File(PackFileName);
         fobjPack.createNewFile();                // pack file gets created

         foobj = new FileOutputStream(fobjPack);

         File fArr[] = fobjfolder.listFiles();

         System.out.println("Number of files in folder :"+fArr.length);

         byte Buffer[] = new byte[1024];

         for(int i = 0; i < fArr.length ; i++)
         {
            fiobj = new FileInputStream(fArr[i]);

            // Loop to read from fiobj & write to foobj

            while((iRet = fiobj.read(Buffer)) != -1)
            {
               foobj.write(Buffer,0,iRet);
            }
         }
      }   
      else
      {
         System.out.println("There is no such Folder");
      }
            
   
   }    
}