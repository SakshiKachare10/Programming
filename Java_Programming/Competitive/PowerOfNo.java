/*
  Write a program to calculate the power of a number using loops
*/
class Logic
{
    void calculatePower(int base, int exp)
    {
        int iCnt = 0 , Power = 1;
        for(iCnt = 1; iCnt <= exp ; iCnt++)
        {
            Power = Power * base;
        }
        System.out.println(Power+" is the Power of given parameter");
    }
}
class PowerOfNo 
{
    public static void main(String A[])
    {
        Logic obj = new Logic();
        obj.calculatePower(2,5);

    }
    
}
