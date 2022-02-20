import java.util.Scanner;
import java.lang.Thread;

//question 19
class Odd implements Runnable {
    int limit;

    Odd(int limit) {
        this.limit = limit;
    }

    public void run() {
        for (int i = 0; i <= limit; i++) {
            // Thread.sleep(10000);
            if (i % 2 != 0){
                System.out.println("Odd: " + i);
            }
        }
    }
}

class Even implements Runnable {
    int limit;

    Even(int limit) {
        this.limit = limit;
    }

    public void run() {
        for (int i = 0; i <= limit; i++)
            if (i % 2 == 0)
                System.out.println("Even: " + i);
    }
}

public class OddEven {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter limit:");
        int limit = s.nextInt();
        Thread odd = new Thread(new Odd(limit));
        Thread even = new Thread(new Even(limit));
        odd.start();
        even.start();
        s.close();
    }

}
