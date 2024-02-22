import java.util.Scanner;

class Capitalize{
public static void main(String[]args){
    Scanner in = new Scanner(System.in);

    System.out.println("enter your name");
    String name = in.next();
    
    System.out.println("The name you have entered is : "+name);

    int i = name.indexOf('-');
    int j = name.lastIndexOf('-');
    String s0 = name.substring(0,1).toUpperCase();
    String s1 = name.substring(1,i).toLowerCase();
    String s2 = name.substring(j,j+2).toUpperCase();
    String s3 = name.substring(j+2).toLowerCase(); 
    System.out.println(s0+s1+s2+s3);
    
}
}