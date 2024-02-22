import java.util.Scanner;
class TestNames{

    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a name (first name first): ");

        String name = input.next();

        int i = name.indexOf('_');
        int j = name.lastIndexOf('_');
        String first = name.substring(0,i);
        String middle = name.substring(i+1 , i+2);
        String last = name.substring(j+1);
        System.out.println("The name in new format is: "+last +","+first+" "+middle+".");

        

    }
}