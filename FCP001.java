import java.util.Scanner;

public class BirthDetails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int birthDate = scanner.nextInt();      // Input: date
        scanner.nextLine();                    // Consume newline
        String birthMonth = scanner.nextLine(); // Input: month (as word)
        int birthYear = scanner.nextInt();      // Input: year

        System.out.println(birthDate);
        System.out.println(birthMonth);
        System.out.println(birthYear);
    }
}
