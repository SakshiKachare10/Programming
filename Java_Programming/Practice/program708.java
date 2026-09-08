import java.util.*;

class program708
{
    public static void main(String a[]) 
    {
        Scanner sobj = new Scanner(System.in);

        String str = null;

        System.out.println("Enter String: ");
        str = sobj.nextLine();

        System.out.println("Input string is : "+str+" having length : "+str.length());

        str = str.trim();
        
        System.out.println("Input string is : "+str+" having length : "+str.length());

        str = str.replaceAll("\\s+", " "); 

        System.out.println("Input string is : "+str+" having length : "+str.length());
    }
}