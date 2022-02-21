import java.util.Arrays;
import java.util.Scanner;

//question 13
class Anagram {

    static boolean areAnagram(char[] str1, char[] str2) {
        int n1 = str1.length;
        int n2 = str2.length;

        if (n1 != n2)
            return false;

        Arrays.sort(str1);
        Arrays.sort(str2);

        for (int i = 0; i < n1; i++)
            if (str1[i] != str2[i])
                return false;

        return true;
    }

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        String str1,str2;
        System.out.print("Enter First String:");
        str1=s.nextLine();
        System.out.print("Enter  Second String:");
        str2=s.nextLine();

        if (areAnagram(str1.toCharArray(), str2.toCharArray()))
            System.out.println("The two strings are"
                    + " anagram of each other");
        else
            System.out.println("The two strings are not"
                    + " anagram of each other");
        s.close();
    }
}
