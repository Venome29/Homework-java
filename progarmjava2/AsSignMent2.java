import java.util.Scanner;
public class Assignment2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print(" Enter the integer number : ");
        int number=sc.nextInt();
        
        String resoult="";

        if(number%2 == 0){

            resoult=number+" Even number ";
            //System.out.println(number+" Even number ");
        }else{
            resoult=number+" odd number ";
        
        }
        System.out.println(resoult);
    }
}
