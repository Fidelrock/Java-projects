//A java program to reverse a string order
import java.util.Scanner;
public class StringReverseOrder{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);

        String name;

        System.out.println("Please enter any string name::");
        name= input.next();
        
        int j;
        for(j=(name.length()-1);j>=0;j--){
            char ch = name.charAt(j);
            System.out.print(ch);
        }

    }
}