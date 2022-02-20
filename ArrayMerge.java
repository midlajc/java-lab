import java.util.Scanner;
//question 8
public class ArrayMerge {
    public static void main(String[] args) {
        int length;
        Scanner s = new Scanner(System.in);
        System.out.println("First Array:");
        System.out.print("Enter length of Array:");
        length = s.nextInt();
        Array array1 = new Array(length);
        array1.readArray(s);
        System.out.println("\nSecond Array:");
        System.out.print("Enter length of Array:");
        length = s.nextInt();
        Array array2 = new Array(length);
        array2.readArray(s);
        Array array = new Array(array1.arrayLength + array2.arrayLength);

        for (int i = 0; i < array1.arrayLength; i++)
            array.array[i] = array1.array[i];
        for (int i = 0; i < array2.arrayLength; i++)
            array.array[i + array1.arrayLength] = array2.array[i];

        System.out.print("\nMerged Array: ");
        for (int i = 0; i < array.arrayLength; i++)
            System.out.print(array.array[i] + " ");
        s.close();
    }
}

class Array {
    int array[], arrayLength;

    Array(int length) {
        this.arrayLength = length;
        array = new int[this.arrayLength];
    }

    void readArray(Scanner s) {
        System.out.print("\nEnter Elements into Array:");
        for (int i = 0; i < this.arrayLength; i++) {
            this.array[i] = s.nextInt();
        }
    }

}