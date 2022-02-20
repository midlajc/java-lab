import java.util.Scanner;

//question 7
class Convertor {
    int number;
    StringBuffer binary = new StringBuffer("");
    StringBuffer octal = new StringBuffer("");
    StringBuffer hexaDecimal = new StringBuffer("");

    Convertor(int number) {
        this.number = number;
        toBinary(number);
        toOctal(number);
        toHexaDecimal(number);
    }

    void toBinary(int number) {
        while (number > 0) {
            this.binary.insert(0, number % 2);
            number /= 2;
        }
    }

    void toOctal(int number) {
        while (number > 0) {
            this.octal.insert(0, number % 8);
            number /= 8;
        }
    }

    void toHexaDecimal(int number) {
        char hex[] = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F' };
        while (number > 0) {
            this.hexaDecimal.insert(0, hex[number % 16]);
            number /= 16;
        }
    }
}

public class BaseConversion {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        Convertor c = new Convertor(s.nextInt());
        System.out.print("\nBinary: " + c.binary);
        System.out.print("\nOctal: " + c.octal);
        System.out.print("\nHexadecimal: " + c.hexaDecimal);
        s.close();
    }
}
