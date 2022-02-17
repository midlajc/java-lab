import java.util.Scanner;
//question 4
class ArmstrongCalculator {
    int length;
    boolean isArmstrong = false;

    ArmstrongCalculator(int num) {
        length = getLength(num);
        if(num==calcSumOfPowerOfDigits(num, length))
            isArmstrong=true;
    }

    int getLength(int num) {
        int i;
        for (i = 0; num != 0; i++, num = num / 10) {
        }
        return i;
    }

    double calcSumOfPowerOfDigits(int num, int length) {
        if (num != 0)
            return Math.pow(num % 10,length) + calcSumOfPowerOfDigits(num / 10, length);
        return 0;
    }
}

class Armstrong {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        ArmstrongCalculator acob = new ArmstrongCalculator(Integer.parseInt(scan.nextLine()));
        System.out.print("The Given Number is ");
        if (acob.isArmstrong)
            System.out.println("a Armstrong Number");
        else
            System.out.println("not a Armstrong Number");
        scan.close();
    }
}