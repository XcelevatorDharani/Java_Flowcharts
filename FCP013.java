import java.util.Scanner;
public class FCP013{
public static void main(String[]args){
Scanner scanner=new Scanner(System.in);
int a=scanner.nextInt();
if(a%2==0){
System.out.println(a);
}
else{
a=(a*2);
System.out.println(a);
}
}
}