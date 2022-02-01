import java.util.Scanner;
public class NestedIF {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your age : ");
        int age=sc.nextInt();
        if(age>=15){
            if(age==15){
                System.out.println("mor5");
            }
            if(age==14){
                System.out.println("mor4");
            }
            if(age==13){
                System.out.println("mor3");
            }
            if(age==12){
                System.out.println("mor2");
            }
            if(age==11){
                System.out.println("mor1");
            }else{
                System.out.println("finish Studing");
            }
            if(age==16){
                System.out.println("mor6");
            }
            if(age==17){
                System.out.println("mor7");
            }
                                     
           
        }else{
            System.out.println("pa thom");
        }
    }
    
}
