import java.util.Scanner;

public class FCP026 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int M = scanner.nextInt(); // First input
        int N = scanner.nextInt(); // Second input
        int sum = 0;

        for (int i = M; i <= N; i++) {
            sum += i;
        }

        System.out.println(sum); // Output the final sum
    }
}
