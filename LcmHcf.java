import java.util.Scanner;

//question 3
public class LcmHcf {
    public static void main(String[] args) {
        int num1, num2, lcm, hcf;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter two Numbers: ");
        num1 = s.nextInt();
        num2 = s.nextInt();
        hcf = num1;

        while (true) {
            if ((num1 % hcf == 0) && (num2 % hcf == 0))
                break;
            else
                hcf--;
        }

        lcm = (num1 * num2) / hcf;

        System.out.println("HCF:" + hcf);
        System.out.println("LCM:" + lcm);
        s.close();
    }
}
