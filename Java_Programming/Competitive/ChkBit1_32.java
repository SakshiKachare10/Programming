import java.util.*;

class Bitwise
{
    public boolean ChkBit(int iNo)
    {
        int iAns = 0;
        int iMask = 0X0000001;
        int ShiftedValue = 0;
        
        ShiftedValue = iNo >>> 1;

        iAns = ShiftedValue & iMask;

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

class ChkBit1_32 
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
            System.out.println("1 & 32 Bits are ON");
        }
        else
        {
            System.out.println("1 & 32 Bits are OFF");
        }


    }
    
}
