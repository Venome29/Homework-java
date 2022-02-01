import java.util.Scanner;
public class AsSignMent2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //System.out.print("Enter the heat (Fahrenheit)");
        //float Fahren=sc.nextInt();

       // float cel = (Fahren-32)*5/9;
       // System.out.println("fahrenheit = "+cel+" celsius.");
        
        
        
        System.out.print("Enter the heat (celsius) = ");
        float cel=sc.nextInt();

        float  fahren = (cel*9/5)+32;
        System.out.println(cel+" celsius  = "+fahren+" fahrenheit.");
    }
    
}
