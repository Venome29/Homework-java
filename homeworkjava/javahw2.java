public class javahw2 {

  
  public static void main(String[] args){
         
        for(int i=1; i<=10; i++){
            int n = 2;
            for(int j=1; j<=6; j++){
                System.out.printf("%5dx%2d=%3d", n, i, n*i);
                n++;
            }
            System.out.println();
        }
         
        System.out.print("\n\n");
         
        for(int i=1; i<=10; i++){
            int n = 8;
            for(int j=1; j<=5; j++){
                System.out.printf("%5dx%2d=%3d", n, i, n*i);
                n++;
            }
            System.out.println();
        }
    }

}