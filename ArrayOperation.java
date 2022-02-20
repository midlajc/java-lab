import java.util.Arrays;
import java.util.Scanner;

//question 6
class ArrayOperation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int limit = 9, largest, secondLargest, smallest;

        while (true) {
            System.out.print("\nEnter limit of Array ( > 10): ");
            limit = Integer.parseInt(scan.nextLine());
            if (limit > 9)
                break;
        }

        int numArray[] = new int[limit];
        System.out.print("Enter Elements into Array: ");
        for (int i = 0; i < limit; i++) {
            numArray[i] = scan.nextInt();
        }

        Arrays.sort(numArray);

        largest = numArray[numArray.length - 1];
        secondLargest = numArray[numArray.length - 2];
        smallest = numArray[0];
        System.out.println("\nLargest: " + largest);
        System.out.println("Second Largest: " + secondLargest);
        System.out.println("Smallest: " + smallest);
        scan.close();
    }
}