import java.util.*;

class Bitwise
{
    public boolean ChkBit(int iNo,int iPos)
    {
        int iAns = 0;
        int iMask = 0X1;

        iMask = iMask << (iPos - 1);

        iAns = iNo & iMask;

        if(iAns == iMask)
        {
            return true;
        }
        else
        {
            return false;
        }

    }

}

class ChkBitAny
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iValue = 0;
        int iLocation = 0;
        boolean bRet = false;

        System.out.println("Enter Number:");
        iValue = sobj.nextInt();

        System.out.println("Enter Location:");
        iLocation = sobj.nextInt();

        Bitwise bobj = new Bitwise();
        bRet = bobj.ChkBit(iValue,iLocation);

        if(bRet == true)
        {
            System.out.println("TRUE");
        }
        else
        {
            System.out.println("FALSE");
        }
    }
    
}
