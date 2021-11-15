import java.util.Scanner;

class Fibonacci{
    static void printFibonacci(int limit){
        int a=-1,b=1,c=0;
        for(int i=0;i<limit;i++,a=b,b=c,c=a+b){
            System.out.print(c+" ");
        }
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter Limit: ");
        int limit=Integer.parseInt(scan.nextLine());
        System.out.print("\nFibonacci Series: ");
        printFibonacci(limit);
        scan.close();
    }
}