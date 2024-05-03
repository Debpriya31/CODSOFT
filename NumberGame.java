import java.util.*;

class NumberGame
{
    public static void main(String args[])
    {
    Scanner sc=new Scanner(System.in);
    Random rand=new Random();
    System.out.println("***Number Game Loading***");
    
    System.out.println("Our system is generating a number for you, and you have to guess it...");
    System.out.println("Let's begin");

    int ng= rand.nextInt(100);

    int round_count = 0;

    System.out.println("A random number has been generated: ");

    for (int i=0; i<=10; i++)
    {
        System.out.println("Please enter any number from 1 to 100 : ");
        int user_input=sc.nextInt();
        round_count++;

        if (user_input==ng)
        {
            System.out.println("You guessed it correctly...");
            System.out.println("You took " + round_count + " rounds to won the number game challenge");
            break;            
        }
        else if (user_input > ng)
        {
            System.out.println("You guessed it too high...");
        }
        else
        {
            System.out.println("You guessed it too low...");
        }

        if (i == ng) 
        {
			System.out.println("You have exhausted" +i+ " trials.");
            System.out.println("The number was " + ng);
		}

    }
    }
}