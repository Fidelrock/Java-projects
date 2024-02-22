//Importing the package
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Fananda{
    public static void main(String[]args){
        //Creating the instance of a class BufferedReader 
        BufferedReader reader= new BufferedReader(new InputStreamReader(System.in));
        String name;
        try{
            System.out.println("Enter your name");
            name=reader.readLine();//Taking string input
            System.out.println("Name="+name);
        }
        catch (Exception e){
            
        }
        }
    }
