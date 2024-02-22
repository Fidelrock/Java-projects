import java.util.Scanner;
class FixY2k{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);

        System.out.println(" Please enter the date in the form \n\n \t\t\tmonth/Day/Year ");
        String date = input.next();
        
        String month = date.substring(0,2);
        System.out.println("The month of the date is: "+month);
        String day = date.substring(3,5);
        System.out.println("The day of the date is: "+day);
        String year = date.substring(6);
        System.out.println("The year of the date is: "+year);

        System.out.println("The whole date is : "+month+"/"+day+"/19"+year);
        

    }
}