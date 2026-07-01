/*
   Write a program which accept two numbers from user and display position
   of common ON bits from that two numbers.
*/
import java.util.*;

class Bitwise
{
    public void CommonBits(int iNo1, int iNo2)
    {
        int iPos = 1;

        while(iNo1 != 0 || iNo2 != 0)
        {
          if((iNo1 & 1) == 1 && (iNo2 & 1) == 1)
          {
            System.out.println(iPos);
          }
          iNo1 = iNo1 >> 1;
          iNo2 = iNo2 >> 1;
          iPos++;
        }

    }
}
class CommonOnBits
{
    public static void main(String A[]) 
    {
        Scanner sobj = new Scanner(System.in);

        int iValue1 = 0, iValue2 = 0;
       
        System.out.println("Enter first Number : ");
        iValue1 = sobj.nextInt();

        System.out.println("Enter Second Number : ");
        iValue2 = sobj.nextInt();

        Bitwise bobj = new Bitwise();
        bobj.CommonBits(iValue1, iValue2);
    
    }
}