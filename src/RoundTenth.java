import java.util.Scanner;

public class RoundTenth {

    public static void main(String[] args)
    {
        // Create a Scanner object
        Scanner scan = new Scanner(System.in);
        // Prompt the user for a positive decimal number
        System.out.print("Decimal number? ");
        double number = scan.nextDouble();
        double averaged = (double)((int)(number * 10 + 0.5)) / 10;
        System.out.println(number + " rounded to the nearest tenth is " + averaged);
        /*Use an expression to calculate
         * the rounded value and assign
         * that value to a variable named
         * rounded.*/

        // Print the output in the form:
        // 11.487 rounded to the nearest tenth is 11.5


    }
}
