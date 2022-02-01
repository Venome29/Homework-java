import java.util.Scanner;
class Ifstatment{
    public static void main(String[] args) {
        try (Scanner kb = new Scanner(System.in)) {
            System.out.print("Enter your age : ");
            int age = kb.nextInt();
            if(age>=18){
                System.out.println("mr and miss");
            }
             if(age<=18){
             System.out.println("END the program");
             }
        }
    }
}

