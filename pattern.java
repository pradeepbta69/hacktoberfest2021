import java.util.Scanner;

public class pattern {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int j, i;
        if (N >= 1 && N <= 200) {
            for (i = 0; i < N; i++) {

                for (j = i; j <= N; j++) {
                    System.out.print(" ");

                }
                for (j = 0; j <= i; j++) {
                    System.out.print("*");
                }
                System.out.println(" ");

            }
        }
    }
}