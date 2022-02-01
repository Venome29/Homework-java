import java.util.Scanner;
public class Mathoperater {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the number one = ");
            int a=sc.nextInt();
            System.out.print("Enter the number two = ");
            int b=sc.nextInt();
            
             

            System.out.println("The sum is equal to = "+(a+b)); //Add
            System.out.println("The sum is equal to = "+(a-b)); //subtract
            System.out.println("The sum is equal to = "+(a*b)); //multiply
            System.out.println("The sum is equal to = "+(a/b)); //divide
            System.out.println("The sum is equal to = "+(a%b)); //fraction
        }
    }
}
