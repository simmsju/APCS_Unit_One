import java.util.Scanner;

public class SeparatingDigits {
    public static void main(String[] args) {
        int n1, n2, n3, n4, n5;
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a five digit whole number:");
        int number = scan.nextInt();
        n5 = number % 10;
        n4 = number % 100 / 10;
        n3 = number % 1000 / 100;
        n2 = number % 10000 / 1000;
        n1 = number % 100000 / 10000;
        System.out.println(n1 + "   " + n2 + "   " + n3 + "   " + n4 + "   " + n5);
    }
}
