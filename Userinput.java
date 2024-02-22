//I am creating a user input program using java
//Importing BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;
//Entering our public class
public class Userinput{
    public static void main(String[]args){
        //Creating the instance of class BufferedReader
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        // Now we declare our variables
        String name;
        int Rollno;
        float marks;
        try{
            System.out.println("Enter your name");
            name=reader.readLine();//Taking strings
            System.out.println("Enter your Rollno");
            Rollno=reader.readInt();//Taking integer
            System.out.println("Enter your marks");
            marks=reader.readFloat();//Taking floats
            //Outputs
            System.out.println("Name="+name);
            System.out.println("Rollno="+Rollno);
            System.out.println("Marks="+marks);
        }
        catch (Exception e){

        }
    }
}
