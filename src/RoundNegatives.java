import java.util.Scanner;

public class RoundNegatives {

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a negative decimal number: ");
        double decimal = scan.nextDouble();
        int rounded = (int)(decimal - 0.5);
        System.out.println(decimal + " rounded to a whole number is " + rounded);
        // Create a Scanner object and write a prompt for the user to enter a number

        // Declare a variable of the correct type that will receive the input from the user.

        // Declare an variable and write an expression to round the user input
        // ex. int roundedNum=/*expression to round a negative value*/;

        // Write a statement that will output the result in the form below.
        // ex. -3.21 rounded to a whole number is -3

    }
}
