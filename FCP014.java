import java.util.Scanner;
public class FCP017{
public static  void main(String[]args){
Scanner scanner = new Scanner(System.in);

int a = scanner.nextInt();
int b = scanner.nextInt();
int c = scanner.nextInt();
int secondmax = 0;
if((a>b && a<c)|| (a>c && a<b)){
secondmax =a;
}
else if((b>a && b<c) || (b>c && b<a)){
secondmax =b;
}
else{
secondmax=c;
}
System.out.println(secondmax);








}




}