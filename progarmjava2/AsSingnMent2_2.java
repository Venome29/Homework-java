import java.util.Scanner;
public class AsSingnMent2_2 {
    //progrom ພສ ເປັນ ຄສ
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter p.s = ");
        int number=sc.nextInt();
        //ເອົາ
        //2565 - 543=>c.t
        //c.t + 543=>p.s
        int resuld = number-543;
        System.out.println(number+"c.t");

        System.out.print("Enter c.t");
        int number1=sc.nextInt();

        int satsana = number1+543;
        System.out.println(satsana+"p.t");
    }
}
