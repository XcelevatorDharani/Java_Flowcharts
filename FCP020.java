import java.util.Scanner;

public class Maxof4{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();
        int D = scanner.nextInt();
           int max,secondMax;
if(A>B){
max=A;
secondMax =B;
}
else {
 max=B;
secondMax=A;
}

if (C > max) {
            secondMax = max;
            max = C;
        } else if (C > secondMax) {
            secondMax = C;
        }


if (D > max) {
            secondMax = max;
            max = D;
        } else if (D > secondMax) {
            secondMax = D;
        }


        System.out.println(secondMax);
    }
}


