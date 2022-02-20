import java.nio.CharBuffer;
import java.util.Scanner;
import java.util.Set;

public class Anagram {
    public static void main(String[] args) {
        String str1, str2;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter First String: ");
        str1 = s.nextLine();
        System.out.println("Enter Second String: ");
        str2 = s.nextLine();

        CharBuffer chArray = CharBuffer.allocate(str1.length());
        // char[] chArray = new char[str1.length()];

        if (str1.length() == str2.length()) {
            // chArray = str1.toCharArray();
            int flag = 0;
            for (int i = 0; i < str2.length(); i++) {
                // chArray.
            }
        } else {
            System.out.println("string length mismatches");
        }

        s.close();
    }
}
