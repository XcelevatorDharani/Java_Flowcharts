import java.util.Scanner;
public class Largest2{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
         int max = Math.max(c,Math.max(a,b));// Assign the value a is max(Math.max is easy method to find a maximum value) 
        
            System.out.println(max);//print the max 
         
    }
}
