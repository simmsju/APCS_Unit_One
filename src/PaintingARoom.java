import javax.swing.tree.FixedHeightLayoutCache;
import java.util.Scanner;

public class PaintingARoom {
    public static void main(String[] args) {
        final int WINDOW = 10;
        final int DOOR = 15;
        final int GALLONS = 350;


        Scanner scan = new Scanner(System.in);
        System.out.println("What is the height of your room in feet?");
        double height = scan.nextDouble();
        System.out.println("What is the length of your first wall in feet?");
        double length1 = scan.nextDouble();
        System.out.println("What is the length of your second wall in feet?");
        double length2 = scan.nextDouble();


        double wall1Areas = length1 * height * 2;
        double wall2Areas = length2 * height * 2;
        double totalAreas = wall1Areas + wall2Areas;


        System.out.println("How many windows are there in the room?");
        int windowsNum = scan.nextInt();
        System.out.println("How many doors are there in the room?");
        int doorsNum = scan.nextInt();


        int subtractedNum = (windowsNum * WINDOW) + (doorsNum * DOOR);
        double finalSquareFeet = totalAreas - subtractedNum;
        double gallonsNeeded = finalSquareFeet / GALLONS;
        int rounded = (((int)(gallonsNeeded * 10) + 10 - 1) / 10);

        System.out.println("To paint this room you will need to buy " + rounded + " gallons of paint.");
    }

}
