import java.util.Scanner;
import java.util.Scanner;
public class AsSignMent1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a money : ");
        int money=sc.nextInt();
        System.out.println("amount = "+money+" KIP ");

        if(money>=1000000){
            //5.000.000/100.000 ຈຳນວນເງິນ
        System.out.println("1.000.000 KIP amount = "+(money/1000000)+" card ");
        //ການມ໋ອດ ຕ້ອງເຮັດການຄຳນວນກ່ອນແລ້ວຈັ່ງມາຫານເອົາຕົວເສດ
        money=money%1000000;
        //System.out.print(" Scrap "+money);
        }
        if(money>=100000){
        System.out.println("100.000 KIP amount = "+(money/100000)+" card ");
        money=money%100000;
        }
        if(money>=50000){
        System.out.println("50.000 KIP amount = "+(money/50000)+" card ");
        money=money%50000;
        }
        if(money>=10000){
        System.out.println("10.000 KIP amount = "+(money/10000)+" card ");
        money=money%10000;
        }
        if(money>=2000){
        System.out.println("2000 KIP amount = "+(money/2000)+" card ");
        money=money%2000;
        }
        if(money>=1000){
        System.out.println("1000 KIP amount = "+(money/1000)+" card ");
        money=money%1000;
        }
        if(money>=500){
        System.out.println("500 KIP amount = "+(money/500)+" card ");
        money=money%500;
        System.out.print(" Scrap "+money+"KIP");
        }
        
        
    }
    
}
