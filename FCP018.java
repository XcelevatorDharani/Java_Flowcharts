import java.util.Scanner;

public class FCP018 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int salary = scanner.nextInt(); // Taking salary input from user
        double HRA = 0;
        double DA = 0;
        double totalSalary = 0;

        if (salary <= 10000) {
            HRA = 20.0 / 100 * salary;
            DA = 80.0 / 100 * salary;
        } else if (salary <= 20000) {
            HRA = 25.0 / 100 * salary;
            DA = 90.0 / 100 * salary;
        } else {
            HRA = 30.0 / 100 * salary;
            DA = 95.0 / 100 * salary;
        }

        totalSalary = salary + HRA + DA;
        System.out.println("Total Salary: " + totalSalary);
    }
}
