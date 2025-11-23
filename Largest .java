import java.util.Scanner;
public class Largest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
         int max = a;// Assign the value a is max 
         if (b>max ){// compare a and b
            max = b;
         }
         if (c> max){//compare c and max
            max = c;
         }
            System.out.println(max);//print the max 
         
    }
}
