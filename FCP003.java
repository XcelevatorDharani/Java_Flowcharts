import java.util.Scanner;

public class SwapUsingThirdVariable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    
        int a = sc.nextInt();
        int b = sc.nextInt();

      
        int temp = a;
        a = b;
        b = temp;

    
        System.out.println(a);
        System.out.println(b);

        sc.close();
    }
}
