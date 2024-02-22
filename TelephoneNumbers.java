import java.util.Scanner;
class TelephoneNumbers{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 10-digit telephone number: ");
        String telephone = input.next();
        
        System.out.println("You entered : "+telephone);

        if(telephone.length()>=10){
            String areaCode = telephone.substring(0,3);
            System.out.println("The area code is : "+areaCode);
            String exchange = telephone.substring(3,6);
            System.out.println("The exchange number is : "+exchange);
            String number = telephone.substring(6);
            System.out.println("The number is: "+number);

            System.out.println("The complete telephone number is: "+"("+areaCode+")"+exchange+ "-" + number);

        }
        else{
            System.out.println("ERROR .PLEASE ENSURE THE DIGITS ARE 10..THANK YOU:");

        }
        
    }
}