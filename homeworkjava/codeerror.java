import java.util.*;
public class codeerror {
    public static void main(String arg[]){
        Scanner scr= new Scanner(System.in);
        System.out.println("ax^2 + bx + c = 0");
        System.out.print("Enter a: ");
            int a = scr.nextInt();
        System.out.print("Enter b: ");
            int b = scr.nextInt();
        System.out.print("Enter c: ");
            int c = scr.nextInt();
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