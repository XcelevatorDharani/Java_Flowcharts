import java.util.Scanner;
public class Largest{
public static  void main(String[]args){
Scanner scanner = new Scanner(System.in);

int a = scanner.nextInt();
int b = scanner.nextInt();

int result = ((a-1)/b)*b;
System.out.println(result);
}
}

