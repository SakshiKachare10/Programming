/*
   Write a program which accept one number from user and count number of
   ON (1) bits in it without using % and / operator.
*/
import java.util.*;

class Bitwise
{
    public int Count(int iNo)
    {
        int iCount = 0;
        int iMask = 0X1;

        while(iNo != 0)
        {
          if((iNo & iMask) == 1)
          {
             iCount++;
          }
          iNo = iNo >> iMask;


        }

        return iCount;

    }
}
class CountOne
{
    public static void main(String A[]) 
    {
        Scanner sobj = new Scanner(System.in);

        int iValue = 0;
        int iRet = 0;

        System.out.println("Enter Number: ");
        iValue = sobj.nextInt();

        Bitwise bobj = new Bitwise();
        iRet = bobj.Count(iValue);

        System.out.println("Count is:"+iRet);
        
    }
}