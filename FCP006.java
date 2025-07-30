import java.util.Scanner;
public class Lastdigit{
public static void main(String[]args){
Scanner scanner = new Scanner(System.in);
int A = scanner.nextInt();
if (A>0){
A=A%10;
System.out.println(A);
}
else {
System.out.println("Invalid");
}
}
}