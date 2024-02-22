//java arrays
import java.util.Scanner;
public class Array1{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int[] number = new int[5];
        int i;
        System.out.println("Please enter five numbers below::");

        //Variable initialization

       /* number[0]= 1;
        number[1]= 4;
        number [2]= 6;
        number[3] = 67;
        number[4] = 464;

 */
        for(i=0;i<number.length;i++){
            number[i]= input.nextInt();
        }
        System.out.println("You have entered::");

        for(i=0;i<number.length;i++){
            System.out.println(number[i]);
        }


    }
}