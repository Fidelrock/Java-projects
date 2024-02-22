import java.util.Scanner;
public class FirstProgram{
    public static void main (String[]args){
        Scanner input = new Scanner(System.in);//Echo is an object
        int num1;
        String Word1;
        System.out.println("Enter a number and I will echo it later : ");
        num1= input.nextInt();
        System.out.println("Enter a word and I will echo it later: ");
        Word1 = input.next();

        System.out.println("Here is the echo to what you have entered: ");

        System.out.println("The number you have entered is: "+num1);//Echoing input to num1
        System.out.println("The word you have entered is: "+Word1);//Echoing the input to Word1
        

    }
}