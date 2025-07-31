import java.util.Scanner;

public class BasicOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

      
        int a = sc.nextInt();
        int b = sc.nextInt();

       
        int sum = a + b;
        int diff = a - b;
        int prod = a * b;
        double div = (double) a / b;  
        int intDiv = a / b;          
        int mod = a % b;              
       
        System.out.println(sum);
        System.out.println(diff);
        System.out.println(prod);
        System.out.println(div);
        System.out.println(intDiv);
        System.out.println(mod);

        sc.close();
    }
}
