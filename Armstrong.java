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
        int start,end;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Range");
        System.out.print("Enter a Start: ");
        start=Integer.parseInt(scan.nextLine());
        System.out.print("Enter a End: ");
        end=Integer.parseInt(scan.nextLine());
        System.out.println("Armstrong Numbres:");
        for(;start<=end;start++){
            ArmstrongCalculator acob = new ArmstrongCalculator(start);
            if (acob.isArmstrong){
                System.out.print(start+" ");
            }
        }
        scan.close();
    }
}