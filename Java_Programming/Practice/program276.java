import java.util.*;

class program276
{
    public static void main(String A[]) 
    {
       Scanner sobj = new Scanner(System.in);
       String data = null;
       int iRet = 0;

       StringX strobj = new StringX();  // ERROR

       System.out.println("Enter String: ");
       data = sobj.nextLine();

       iRet = strobj.CountCapital(data);
       System.out.println("Number of Capital Characters : "+iRet);

       iRet = strobj.CountSmall(data);
       System.out.println("Number of Small Characters : "+iRet);

       iRet = strobj.CountDigits(data);
       System.out.println("Number of Digits are : "+iRet);

       iRet = strobj.CountSpace(data);
       System.out.println("Number of white Spaces are : "+iRet);

       iRet = strobj.CountSpecial(data);
       System.out.println("Number of Special Symbols are : "+iRet);
        
        
    }
}