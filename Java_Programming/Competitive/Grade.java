/*
  Write a program to display the grade of a student based on marks
*/
class Logic
{
    void displayGrade(int marks)
    {
        if(marks >= 80 && marks <= 100)
        {
            System.out.println("Grade : O(Outstanding)");
        }
        else if(marks >= 70 && marks <= 79)
        {
            System.out.println("Grade : A+(Excellent)");
        }
        else if(marks >= 60 && marks <= 69)
        {
            System.out.println("Grade : A(Very Good)");
        }
        else if(marks >= 55 && marks <= 59)
        {
            System.out.println("Grade : B+(Good)");
        }
        else if(marks >= 50 && marks <= 54)
        {
            System.out.println("Grade : B(Above Average)");
        }
        else if(marks >= 45 && marks <= 49)
        {
            System.out.println("Grade : C(Average)");
        }
        else if(marks >= 40 && marks <= 44)
        {
            System.out.println("Grade : P(Pass)");
        }
        else if(marks >= 0 && marks <= 39)
        {
            System.out.println("Grade : F(Fail)");
        }
    }
}
class Grade 
{
    public static void main(String A[]) 
    {
        Logic obj = new Logic();
        obj.displayGrade(82);
    }
    
}
