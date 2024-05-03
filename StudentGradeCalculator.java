import java.util.*;

class StudentGradeCalculator
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the marks of English Subject:- ");
        double eng=sc.nextDouble();

        System.out.println("Enter the marks of Python Subject:- ");
        double python=sc.nextDouble();

        System.out.println("Enter the marks of Operating System Subject:- ");
        double os=sc.nextDouble();

        System.out.println("Enter the marks of Maths Subject:- ");
        double maths=sc.nextDouble();

        System.out.println("Enter the marks of Networking Subject:- ");
        double networking=sc.nextDouble();

        double total= eng + python + os + maths + networking;

        System.out.println("The total marks of the student is:- "+total);

        double avg= total / 5;

        System.out.println("The average percentage of the student is:- "+avg);

        if (avg>=90 || avg<=90)
        {
            System.out.println("The student grade is 'A'");
        }
        else if (avg>=85 || avg<=89)
        {
            System.out.println("The student grade is 'B'");
        }
        else if (avg>=80 || avg<=84)
        {
            System.out.println("The student grade is 'B+'");
        }
        else if (avg>=75 || avg<=79)
        {
            System.out.println("The student grade is 'C+'");
        }
        else if (avg>=70 || avg<=74)
        {
            System.out.println("The student grade is 'C'");
        }
        else if (avg>=60 || avg<=69)
        {
            System.out.println("The student grade is 'D'");
        }
        else
        {
            System.out.println("The student grade is 'F'");
        }

    }
}