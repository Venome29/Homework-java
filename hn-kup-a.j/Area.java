//Ex6
import java.util.Scanner;
import java.util.logging.LogRecord;
class Area {
    public static void main(String[] args) {
        try (Scanner kb = new Scanner(System.in)) {
            int lengthy = 0;
            int width = 0;
            int arae = 0;
            int perimeter = 0 ;
            System.out.print("Please enter the lengthy of Rectangle =  ");
            lengthy = kb.nextInt();

            System.out.print("Please enter the width of Rectangle =  ");
            width = kb.nextInt();

            arae = lengthy * width;
            perimeter = 2 * (lengthy + width);
            System.out.println("The Area of Rectangle = "+arae);
            System.out.println("The Perimeter of Rectangle = "+perimeter);
        }


    }
}