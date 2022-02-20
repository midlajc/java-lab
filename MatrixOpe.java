import java.util.Scanner;

//question 11
class Matrix {
    int matrix[][], transpose[][], trace = 0, m, n;

    Matrix(int m, int n, Scanner s) {
        this.m = m;
        this.n = n;
        matrix = new int[m][n];
        transpose = new int[n][m];
        System.out.println("Enter Elements in to Array:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = s.nextInt();
                if (i == j)
                    trace += matrix[i][j];
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }

    }

    void printTranspose() {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println("");
        }
    }
}

public class MatrixOpe {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter order of Matrix(m x n): ");
        Matrix m = new Matrix(s.nextInt(), s.nextInt(), s);
        System.out.println("\nTrace: " + m.trace);
        System.out.println("Transpose: ");
        m.printTranspose();
        s.close();
    }
}
