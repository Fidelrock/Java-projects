import java.util.Scanner;

public class PrintNames{
    public static void main(String []args){
        Scanner input = new Scanner(System.in);

        String firstName ;
        String lastName;

        System.out.println("Enter your first name");
        firstName = input.next();
        System.out.println("Enter your last name");
        lastName = input.next();

        System.out.println("Hello "+lastName+ " "+firstName);
    }
}