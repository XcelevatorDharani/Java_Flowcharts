import java.util.Scanner;

public class FCP015 {
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input four numbers
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        int max;

        if (a > b && a > c && a > d) {
            max = a;
        } else if (b > a && b > c && b > d) {
            max = b;
        } else if (c > a && c > b && c > d) {
            max = c;
        } else {
            max = d;
        }

        System.out.println(max);

        sc.close();
    }
}
