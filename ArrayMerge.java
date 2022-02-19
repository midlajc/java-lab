import java.util.Scanner;

public class ArrayMerge {
    static int array[];

    static void mergeArray(Array array1, Array array2) {
        int n1 = array1.arrayLength, n2 = array2.arrayLength;
        array = new int[n1 + n2];
        for (int i = 0; i < n1; i++) {
            array[i] = array1.array[i];
        }
        for (int i = 0; i < n2; i++) {
            array[i + n1] = array1.array[i];
        }
    }

    public static void main(String[] args) {
        System.out.println("First Array:");
        Array array1 = new Array();
        System.out.println("Second Array:");
        Array array2 = new Array();
        mergeArray(array1, array2);
        System.out.println("\n\nMerged Array:\n");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
        }
    }
}

class Array {
    int array[], arrayLength;

    Array() {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter length of Array:");
        this.arrayLength = s.nextInt();
        array = new int[this.arrayLength];
        System.out.println("\nEnter Elements into Array:");
        for (int i = 0; i < this.arrayLength; i++) {
            this.array[i] = s.nextInt();
        }
        s.close();
    }
}