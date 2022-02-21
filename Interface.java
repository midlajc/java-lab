import java.util.Scanner;

//question 18
interface Volume {
    double pie = 3.14285714286;

    void readData(Scanner s);

    void displayVolume();
}

class Sphere implements Volume {
    int radius;

    public void readData(Scanner s) {
        System.out.print("Enter radius of Sphere:");
        radius = s.nextInt();
    }

    public void displayVolume() {
        double volume = (4.0 / 3.0) * Volume.pie * (radius * radius * radius);
        System.out.print("Volume of Sphere: " + volume);
    }
}

class Cylinder implements Volume {
    int radius, height;

    public void readData(Scanner s) {
        System.out.print("\nEnter height of Cylinder: ");
        height = s.nextInt();
        System.out.print("Enter radius of Cylinder: ");
        radius = s.nextInt();

    }

    public void displayVolume() {
        double volume = Volume.pie * (radius * radius) * height;
        System.out.println("Volume of Cylinder=" + volume);
    }

}

public class Interface {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        Sphere sp = new Sphere();
        Cylinder c = new Cylinder();
        sp.readData(s);
        sp.displayVolume();
        c.readData(s);
        c.displayVolume();
        s.close();
    }
}