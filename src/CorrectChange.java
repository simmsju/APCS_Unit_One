import java.util.Scanner;

public class CorrectChange {
    public static void main(String[] args) {
        int dollars = 100;
        int quarters = 25;
        int dimes =  10;
        int nickels = 5;
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a whole number of cents:");
        int cents = scan.nextInt();
        int left = cents;
        int numDollars = cents/dollars;
        left = cents % dollars;
        int numQuarters = left/quarters;
        left = left % quarters;
        int numDimes = left/dimes;
        left = left % dimes;
        int numNickels = left/nickels;
        left = left % nickels;
        int numPennies = left;
        System.out.println("You have " + numDollars + " dollars, " + numQuarters + " quarters, " + numDimes + " dimes, " + numNickels + " nickels, " + numPennies + " pennies");
    }
}
