//question 2
public class CommandLineArg {
    public static void main(String[] args) {
        int a, b;

        a = Integer.parseInt(args[0]);
        b = Integer.parseInt(args[1]);

        System.out.println("Sum = " + (a + (b + 0.0)));
        System.out.println("Difference = " + (a - (b + 0.0)));
        System.out.println("Product = " + (a * (b + 0.0)));
        System.out.println("Quotient = " + (a / (b + 0.0)));
        System.out.println("Remainder = " + (a % (b + 0.0)));
    }
}
