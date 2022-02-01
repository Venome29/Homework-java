import java.util.Scanner;
public class SwitchCase {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Symtoms th disease = ");
        String panic = sc.nextLine();
        String name;

        // if(month==1){
        //     name = "january";
        // }else if(month==2){
        //     name="fabuary";
        // }else if(month==3){
        //     name="march";
        // }else if(month==4){
        //     name="April";
        // }else{
        //     name="Every month";
        // }
        // System.out.println(name);
        switch (panic) {
            case 1:
                name="january";
                break;
            case 2:
                name="fabuary";
                break;
        
            case 3:
                name="march";
                break;
        
            default:
            name="Every month";
                break;
        }
        System.out.println(name);
    
    }
    
}
