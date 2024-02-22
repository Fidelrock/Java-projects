//importing the package
import java.util.Scanner;
 public class Easy{
    //Creating the instance of class scanner
    Scanner obj = new Scanner(System.in);
    String name;
    int rollno;
    float marks;
    System.out.println ("Enter your name");
    name=obj.nextLine();//Accepting string input
    System.out.println ("Enter your Rollno");
    rollno = obj.nextInt();//Taking integer inputs
    System.out.println ("Enter your marks");
    marks= obj. nextFloat();
    //Printing the output
    System.out.println("Name="+name) ;
    System.out.println("Rollno:"+rollno);
    System.out.println("Marks:"+marks);
 }