import java.util.Scanner;

public class DateFormat {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("What is the current month?");
        String month = scan.nextLine();
        System.out.println("What is the current day of the week?");
        String dayOfTheWeek = scan.nextLine();
        System.out.println("What is the current year?");
        int year = scan.nextInt();
        System.out.println("What is the current day of the month?");
        int dayOfTheMonth = scan.nextInt();
        System.out.println("American Format:");
        System.out.println(dayOfTheWeek + ", " + month + " " + dayOfTheMonth + ", " + year);
        System.out.println("European Format:");
        System.out.println(dayOfTheWeek + ", " + dayOfTheMonth + " " + month + ", " + year);
    }
}
