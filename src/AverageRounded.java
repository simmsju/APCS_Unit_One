import java.util.Scanner;

public class AverageRounded {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter three positive decimals:");
        double num1 = scan.nextDouble();
        double num2 = scan.nextDouble();
        double num3 = scan.nextDouble();
        int average = (int)((num1 + num2 + num3) / 3 + 0.5);
        System.out.println("Average = " + average);
    }
}
