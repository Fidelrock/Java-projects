//Importing the scanner class
import java.util.Scanner;

public class Identity{
    public static void main(String[]args){
        //Creating an instance of a Scanner class
        Scanner in = new Scanner(System.in);
        String name,Nationality;
        String hobbies[]=new String[3];
        String Home_address,Career,Marital_status;
        int Age,i;
        System.out.println("Enter your Name");
        name= in.nextLine();
        System.out.println("Enter your Nationality");
        Nationality= in.nextLine();
        System.out.println("Enter atleast two of your hobbies");
        for(i=1;i<3;i++){
            hobbies[i]=in.nextLine();
        }
        System.out.println("Enter your Home address");
        Home_address= in.nextLine();
        System.out.println("Enter your Career");
        Career= in.nextLine();
        System.out.println("Enter your Age");
        Age= in.nextInt();
        System.out.println("Enter your Marital Status");
        Marital_status = in.nextLine();
        //System(cls);
        System.out.println("Welcome "+name+"below are your details");
        System.out.println("| Name |Nationality | hobbies | Home_address | Career | Age | Marital_Status");
        //System.out.println(name+"|",Nationality+"|",hobbies[i]+"|",Home_address+"|",Career+"|",Age+"|",Marital_status+"|");


    }
}