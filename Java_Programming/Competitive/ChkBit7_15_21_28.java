import java.util.*;

class Bitwise
{
    public boolean ChkBit(int iNo)
    {
        int iAns = 0;
        int iMask = 0X08104040;

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

class ChkBit7_15_21_28 
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iValue = 0;
        boolean bRet = false;

        System.out.println("Enter Number: ");
        iValue = sobj.nextInt();

        Bitwise bobj = new Bitwise();
        bRet = bobj.ChkBit(iValue);

        if(bRet == true)
        {
            System.out.println("7,15,21,28 Bits are ON");
        }
        else
        {
            System.out.println("7,15,21,28 Bits are OFF");
        }


    }
    
}
