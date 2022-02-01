import java.util.Scanner;
class Scan{
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("name = ");
            String name=sc.nextLine();

            System.out.print("This year = ");
            int year =sc.nextInt();
            int age= 2000 - year;

            System.out.println("your name is =" +name);
            System.out.println("your of birth=" +year);
            System.out.println("Age =" +age);

        }
    }
}