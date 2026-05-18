import java.util.Scanner;
public class matrix_addition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of rows");
        int r = sc.nextInt();
        System.out.println("Enter no of col");
        int c = sc.nextInt();
        int a1[][] = new int[r][c];
        int b1[][] = new int[r][c];
        int res[][] = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.println("Enter the value for 1st matrix");
                a1[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.println("Enter the value for 2st matrix");
                b1[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                res[i][j] = b1[i][j] + a1[i][j];
            }
        }
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.println("res[" + i + "][" + j + "=" + res[i][j]);
            }
        }


    }
}