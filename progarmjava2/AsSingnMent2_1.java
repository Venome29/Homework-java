import java.util.Scanner;
public class AsSingnment2_1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the integer = ");
        int number=sc.nextInt();


        String resuld="";
        //ການໃຊ້thernaly oberlaterໃນການຂຽນ if else ແບບຫຍໍ້;
        resuld = (number%2 == 0) ? number+ " = Even number" : number+" = odd number  ";
        System.out.println(resuld);
    }
    
}
