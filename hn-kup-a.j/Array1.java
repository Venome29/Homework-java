//Ex3
import java.util.Arrays;
public class Array1{
    public static void main (String args[]){
    int array1[] = { 1,2,3,4,5};
    int array2 [] ={100,101,102,103,104};
    int array3 [] = new int [5];
    int count = array3.length;
    int number1;
    int number2;
    for (int i=0; i< count; i++){
         number1 = array1[i];
         number2 = array2[i];

        array3[i] = number1+number2;
    
    }
    System.out.println(Arrays.toString(array3));
  }
 }