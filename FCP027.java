import java.util.Scanner;
public class FCP027 {
public static  void main(String[]args){
Scanner scanner = new Scanner(System.in);

int M = scanner.nextInt();
int N = scanner.nextInt();
int sum = 0;
for(int i =M ;i <= N ; i++){


sum = sum + i ;
}

System.out.println(sum);
}
}