import java.util.Scanner;
public class FCP012{
public static void main (String[]args){
Scanner scanner=new Scanner(System.in);
int A = scanner.nextInt();
if (A==0){
System.out.println("Zero");
}

else if(A>=0){
System.out.println("Positive");
}

else {
System.out.println("Negative");
}

}
}