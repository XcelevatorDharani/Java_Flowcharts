import java.util.Scanner;
public class FCP026 {
public static  void main(String[]args){
Scanner scanner = new Scanner(System.in);

int N = scanner.nextInt();
int sum = 0;
for(int i =1 ; i <= N ; i++){
if (i % 2 != 0){

sum = sum + i ;
}
}
System.out.println(sum);
}
}
