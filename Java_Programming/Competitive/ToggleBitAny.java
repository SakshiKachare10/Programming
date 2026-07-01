import java.util.*;

class Bitwise
{
    public int ToggleBit(int iNo, int iPos)
    {
        int iAns = 0;
        int iMask = 0X1;

        iMask = iMask << (iPos - 1);

        iAns = iNo ^ iMask;

        return iAns;

    }
}
class ToggleBitAny
{
    public static void main(String A[]) 
    {
        Scanner sobj = new Scanner(System.in);

        int iValue = 0;
        int iLocation = 0;
        int iRet = 0;

        System.out.println("Enter Number: ");
        iValue = sobj.nextInt();

        System.out.println("Enter Position: ");
        iLocation = sobj.nextInt();

        Bitwise bobj = new Bitwise();
        iRet = bobj.ToggleBit(iValue,iLocation);

        System.out.println("Modified Number is:"+iRet);
        
    }
}