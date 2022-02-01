import  java.util.Scanner;

import javax.imageio.plugins.bmp.BMPImageWriteParam;
public class Assignment{
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Eter weight (kg) : ");
            double weight=sc.nextDouble();
            System.out.print("Eter height (cm) : ");
            double height=sc.nextDouble();
            height=height/100;


            //kan khit lai
            double bmi= weight/(height*height);
            //bmi = body mass index
            
            System.out.println("weight = "+weight);
            System.out.println("Height = "+height);
            System.out.println("Body mass index = "+bmi);

             String expact="";

            if(bmi<18){
              expact="Subsatandard";//ຕຳກວ່າມາດຕະຖານ
            }
            else if(bmi>=18.5 && bmi<=22.9){
                expact="Equation"; //ສົມສວນ
            }
            else if(bmi>=23.0 && bmi<=24.9){
                expact="overweight";//ນຳ້ໜັກເກີນ
            }
            else if(bmi>=25.0 && bmi<=29.9){
                expact="obesity";//ຸໂລກອ້ວນ
            }
            else if(bmi>=30.0 && bmi<=70.0){
                expact="Dangerous lebel of obesity";//ໂລກອ້ວນອັນຕະລາຍ
            }else{
                expact="not found";
            }
            System.out.println("predict = "+expact);
        }
        

    }
}