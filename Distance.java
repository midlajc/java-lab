import java.util.Scanner;

//question 1
public class Distance {
    public static void main(String args[]) {
        int x1, x2, y1, y2;
        Double distance;

        Scanner s = new Scanner(System.in);
        System.out.print("Enter First point: ");
        x1 = s.nextInt();
        y1 = s.nextInt();
        System.out.print("Enter Second point: ");
        x2 = s.nextInt();
        y2 = s.nextInt();

        distance = Math.sqrt((y2 - y1) * (y2 - y1) + (x2 - x1) * (x2 - x1));
        System.out.println("Distance between (" + x1 + "," + y1 + ") and " + "(" + x2 + "," + y2 + "): " + distance);
        s.close();
    }
}