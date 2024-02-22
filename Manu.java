// user input
import java.util.Scanner;
public class Manu{
    public static void main(String[]args){
        //creating an instance
        Scanner add= new Scanner(System.in);
        String name;
        int x,y,z;

        System.out.println("Enter your name");
        name= add.nextLine(); 
        System.out.println("Welcome " +  name);
        System.out.println("Enter your first number");
        x= add.nextInt();
        System.out.println("Enter Number next");
        y= add.nextInt();
        z=x+y;
        //System.out.println((x) "+"(y));//System.out.println("+" +y);
        
        System.out.println("Answer: "+z);

    }
}