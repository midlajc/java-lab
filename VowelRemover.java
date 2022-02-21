import java.util.Scanner;

//question 14
public class VowelRemover {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String string = s.nextLine();
        char str[] = string.toCharArray();
        StringBuffer buffer = new StringBuffer();
        for (int i = 0; i < str.length; i++) {
            switch (str[i]) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    break;
                default:
                    buffer.append(str[i]);
            }
        }
        System.out.println("String with out Vowel letters: " + buffer);
        s.close();
    }
}