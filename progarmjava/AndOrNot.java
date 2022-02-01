import java.util.Scanner;
public class AndOrNot {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your age : ");
        int age=sc.nextInt();

        //if(!(age>=20)){
        //if(age>=20 @@ age=30){
        //if(age>=20 || age=30){
        if(age>=20){
            System.out.println(" wai loun ");
        }else{
            System.out.println(" dex noy ");
        }

    }
}
