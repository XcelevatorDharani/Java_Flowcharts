import java.util.Scanner;
public class FCP037{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int sum=0;

		for (int i=1; i<a; i++){
			if(a%i==0){
				sum = sum+i;
			}
		}
		if (a==sum){
			System.out.println("Yes");
		}
		else{
			System.out.println("No");
		}
	}
}
