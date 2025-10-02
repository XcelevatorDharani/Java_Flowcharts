import java.util.Scanner;
public class FCP036{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int lcm=0;
		int c=0;

		if(a>b){
			c = a;
		}
		else{
			c = b;
		}
		for (int i = c; i>0; i--){
			if(a%i==0 && b%i==0){
				lcm=i;
				System.out.println(lcm);
				break;
			}
		}
		int hcf = (b*a)/lcm;
		System.out.println(hcf);
	}
}
