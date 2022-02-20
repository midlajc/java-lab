import java.util.Scanner;

//question 17
class VolumeOF {
    double vol, a, b, c;

    void findVolume(double a) {
        System.out.println("Volume of Cube = " + (a * a * a));
    }

    void findVolume(double a, double b, double c) {
        System.out.println("Volume of Rectangular box = " + (a * b * c));
    }

    void findVolume(double a, double b) {
        System.out.println("Volume of Cylinder = " + (3.14 * a * a * b));
    }
}

public class Volume {
    public static void main(String args[]) {
        double a, b, c;

        Scanner s = new Scanner(System.in);
        VolumeOF obj = new VolumeOF();

        System.out.print("Enter the side of cube : ");
        a = s.nextDouble();

        obj.findVolume(a);

        System.out.print("Enter the length, width and height of the Rectangular box : ");
        a = s.nextDouble();
        b = s.nextDouble();
        c = s.nextDouble();

        obj.findVolume(a, b, c);

        System.out.print("Enter the radius and height of the Cylinder : ");
        a = s.nextDouble();
        b = s.nextDouble();

        obj.findVolume(a, b);

        s.close();
    }
}