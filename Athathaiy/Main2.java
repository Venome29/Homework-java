import java.util.Scanner;
class Main2{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Number A :  ");
        int number1=sc.nextInt();
        System.out.print("Enter Number B :  ");
        int number2=sc.nextInt();
        int x=1, y=2, z=3;
        char num1='A',num2='B';
        System.out.println(num1+" + "+num2+" : "+x+" + "+y+" = "+z);
        System.out.println(num1+" + "+num1+" : "+x+" + "+x+" = "+y);
        System.out.println("("+num2+" - "+num1+")"+" : "+z+" - "+y+" = "+x);
        System.out.println("("+num1+" - "+num2+")"+" - "+y+" : "+"("+x+" + "+y+")"+" - "+y+" = "+x);
        
    }
}