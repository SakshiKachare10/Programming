
import java.util.*;

class Bitwise
{
    public int ToggleBit(int iNo)
    {  
        int iAns = 0;
        int iMask = 0X40;

        iAns = iNo ^ iMask;

        return iAns;

    }
}

class ToggleBit7 
{
    public static void main(String A[]) 
    {
        Scanner sobj = new Scanner(System.in);

        int iValue = 0;
        int iRet = 0;

        System.out.println("Enter Number:");
        iValue = sobj.nextInt();

        Bitwise bobj = new Bitwise();
        iRet = bobj.ToggleBit(iValue);

        System.out.println("Modified Number is:"+iRet);

        
    }
    
}
