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
            numArray[i] = Integer.parseInt(scan.nextLine());
        }
        largest=secondLargest=smallest=numArray[0];
        for (int i = 1; i < limit; i++) {
            if(numArray[i]>largest)
                largest=numArray[i];
            if(numArray[i]<smallest)
                smallest=numArray[i];
            if(numArray[i]>secondLargest||numArray[i]<largest)
                secondLargest=numArray[i];    
        }
        System.out.println("Largest: "+largest);
        System.out.println("Second Largest: "+secondLargest);
        System.out.println("Smallest: "+smallest);
        scan.close();
    }
}