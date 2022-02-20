import java.util.Scanner;

//question 10
public class Centimeter {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter length in Centimeter: ");
        double centimeter = s.nextDouble();
        System.out.println("\nLength in Inch: " + centimeter / 2.54);
        System.out.println("Length in Meter: " + centimeter / 100.0);
        System.out.println("Length in Kilometer: " + centimeter / 100000.0);
        s.close();
    }
}
