import java.util.*;

class program140
{
    public static void main(String A[]) 
    {
        Scanner sobj = new Scanner(System.in);

        int Arr[] = {10,20,30,40,50};

        // Bad Programming Practice dont initialize iCnt in loop we cant reuse it 
        for(int iCnt = 0; iCnt < Arr.length; iCnt++)
        {
             System.out.println(Arr[iCnt]);
        }

        System.out.println(iCnt);  // ERROR
        
        
    }
}