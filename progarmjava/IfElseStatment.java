import java.util.Scanner;
class IfElseStatment{
    public static void main(String[] args) {
        try (Scanner kb = new Scanner(System.in)) {
            System.out.print("Enter your age : ");
            int age = kb.nextInt();
            if (age>=18){
                System.out.println("prefixes mr and miss");
            }else{
             System.out.println("prefixsed boy and gilr");
             }
             System.out.println("end the program");
        }
    }
}

