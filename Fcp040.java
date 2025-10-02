import java.util.Scanner;
public class FCP040{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = sc.nextInt();
		int max = a;
		int smax = a;

		for (int i=1 ; i<n; i++){
			int b = sc.nextInt();
			if (b>max){
				smax=max;
				max=b;
			}
			else{
				if(b>smax){
					smax= b;
				}
			}
		}
		System.out.println(smax);
	}
}
