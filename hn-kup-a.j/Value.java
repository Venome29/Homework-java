//Ex7
import java.util.Scanner;

public class Value {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("ax^2 + bx + c = 0");

        int a, b, c;
        System.out.print("Enter a value: ");
        a = sc.nextInt();
        System.out.print("Enter b value: ");
        b = sc.nextInt();
        System.out.print("Enter c value: ");
        c = sc.nextInt();

        System.out.println("a = " + a + "\nb = " + b +"\nc = " + c);
            int d = (b*b) - 4*a*c;
        if (d > 0){
        System.out.println("Delta > 0,\nX1 = " + ( ( -b + Math.sqrt(a)) ) / (2*a)
            + "\nX2 = " + ( (-b - Math.sqrt(a)) ) / (2*a) );
        }
        else if (d == 0){
        System.out.println("Delta == 0, X1 = X2 = " + -b / (2*a) );
        }
        else{
        System.out.println("Delta < 0, No Result");
        }
    }
}
