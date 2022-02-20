import java.util.Scanner;

//question 12
class Num {
    int number, sum = 0;
    StringBuffer reverse = new StringBuffer("");

    Num(int number) {
        this.number = number;
        if (number == 0)
            this.reverse.append("0");
        while (number != 0) {
            this.sum += number % 10;
            this.reverse.append(number % 10);
            number /= 10;
        }
    }
}

public class Number {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        Num n = new Num(s.nextInt());
        System.out.println("Sum: " + n.sum);
        System.out.println("Reverse: " + n.reverse);
        s.close();
    }
}
