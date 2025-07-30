import java.util.Scanner;

public class Frequency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();
        int D = scanner.nextInt();
        int E = scanner.nextInt();

        // Frequency of A
        int countA = 1;
        if (A == B) countA++;
        if (A == C) countA++;
        if (A == D) countA++;
        if (A == E) countA++;
        System.out.println(A + " = " + countA);

        // Frequency of B (if not already counted as A)
        if (B != A) {
            int countB = 1;
            if (B == C) countB++;
            if (B == D) countB++;
            if (B == E) countB++;
            System.out.println(B + " = " + countB);
        }

        // Frequency of C (if not counted before)
        if (C != A && C != B) {
            int countC = 1;
            if (C == D) countC++;
            if (C == E) countC++;
            System.out.println(C + " = " + countC);
        }

        // Frequency of D (if not counted before)
        if (D != A && D != B && D != C) {
            int countD = 1;
            if (D == E) countD++;
            System.out.println(D + " = " + countD);
        }

        // Frequency of E (if not counted before)
        if (E != A && E != B && E != C && E != D) {
            System.out.println(E + " = 1");
        }
    }
}
