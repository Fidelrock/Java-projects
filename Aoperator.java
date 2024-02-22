//Java arithmetic operators
/*The user is to input a sign and the operaiond automate */
import java.util.Scanner;
public class Aoperators{
    public static void main(String[]args){
        Scanner object = new Scanner(System.in);
        int no[] = new int[2];
        int i;
        char sign;
        //user to in put
        System.out.println("Enter tow numbers to work out the calculations");
        for(i=1;i<3;i++){
            no[i]= object.nextInt();
        }
        System.out.println("Enter any sign of your choice to work with:");
        sign = object.nextChar();
        //Involving the loop to check various conditions before calculating
        if(sign=='+'){
            System.out.println(no[1]+ "+" +no[2]+ "=" +(no[1]+no[2]));
        }
        else if(sign =='-'){
            System.out.println(no[1]+ "-" +no[2]+ "=" +(no[1]-no[2]));
        }
        else if(sign =='%'){
            System.out.println(no[1]+ "%" +no[2]+ "=" +(no[1]%no[2]));
        }
        else if(sign =='*'){
            System.out.println(no[1]+ "*" +no[2]+ "=" +(no[1]*no[2]));
        }
        else if(sign =='/'){
            System.out.println(no[1]+ "/" +no[2]+ "=" +(no[1]/no[2]));
        }
        
    }
}