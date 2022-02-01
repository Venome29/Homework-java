import java.util.Scanner;
public class AgeIfStm {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your age = ");
        int age=sc.nextInt();
        if(age>=15 && age<=19){
            System.out.println("Teenager");//ໄວລຸນ
        }
        else if(age>=20 && age<=29){
            System.out.println("adolescence");//ຊາວໜຸ່ມ
        }
        else if(age>=30 && age<=39){
            System.out.println("working age");//ໄວເຮັດວຽກ
        }
        else if(age>=40 && age<=59){
            System.out.println("middle-age");//ໄວກາງຄົນ
        }
        else if(age<=60 && age>=89){
            System.out.println("old age");//ໄວສະລາ
        }else{
            System.out.println("age range not found");
        }
        System.out.println("end the program");
    }
    
}
