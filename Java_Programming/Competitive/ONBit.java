import java.util.*;

class Bitwise
{
    public int OnBit(int iNo)
    {
        int iAns = 0;
        int iMask = 0XF;

        iAns = iNo | iMask;

        return iAns;
    }
}

class ONBit
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iValue = 0;
        int iRet = 0;

        System.out.println("Enter Number:");
        iValue = sobj.nextInt();

        Bitwise bobj = new Bitwise();
        iRet = bobj.OnBit(iValue);

        System.out.println("Modified Number is:"+iRet);


    }
}