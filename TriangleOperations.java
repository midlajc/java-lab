import java.util.Scanner;

//question 5
class Triangle {
    int s1, s2, s3;
    Boolean isValid = false;
    String type;
    Double area;

    void checkValid() {
        int high, rem;
        if (s1 > s2 && s1 > s3) {
            high = s1;
            rem = s2 + s3;
        } else if (s2 > s3) {
            high = s2;
            rem = s1 + s3;
        } else {
            high = s3;
            rem = s1 + s2;
        }
        if (high < rem) {
            this.isValid = true;
        }
    }

    void checkType() {
        if (s1 == s2 && s2 == s3) {
            this.type = "Triangle is Equilateral !!";
        } else if (s1 == s2 || s2 == s3 || s3 == s1) {
            this.type = "Triangle is Isosceles !! ";
        } else {
            this.type = "Triangle is Scalene !! ";
        }
    }

    void calcArea() {
        double s = (s1 + s2 + s3) / 2.0;
        this.area = Math.sqrt(s * (s - s1) * (s - s2) * (s - s3));
    }

    Triangle() {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter first side of triangle : ");
        this.s1 = Integer.parseInt(s.nextLine());
        System.out.print("Enter second side of triangle : ");
        this.s2 = Integer.parseInt(s.nextLine());
        System.out.print("Enter last side of triangle : ");
        this.s3 = Integer.parseInt(s.nextLine());
        checkValid();
        if (!this.isValid) {
            System.out.println("\nA triangle is valid if sum of its two sides is greater than the third side!!");
            System.out.println("\nCant't form Triangle!!");
        } else {
            checkType();
            calcArea();
        }
        s.close();
    }
}

public class TriangleOperations {
    public static void main(String[] args) {
        Triangle t = new Triangle();
        if (t.isValid) {
            System.out.println('\n' + t.type);
            System.out.println("\nArea of the Triangle : " + t.area);
        }
    }
}
