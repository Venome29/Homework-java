import java.util.Scanner;
class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Number :  ");
        int number1=sc.nextInt();
        System.out.print("Enter Number :  ");
        int number2=sc.nextInt();
        int x=1, y=2, z=3;
        System.out.println(x+" + "+y+" = "+z);
        System.out.println(x+" + "+x+" = "+y);
        System.out.println(z+" - "+y+" = "+x);
        System.out.println(y+" - "+x+" = "+x);
        
    }
}