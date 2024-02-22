/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package months;

/**
 *
 * @author fidel
 */
import java.util.Scanner;
public class Months {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the month: ");
        String month = input.nextLine();
        
        System.out.println("You entered: "+month);
        
        String abbr = month.substring(0,3).toUpperCase();
        System.out.println("It's abbreviation is : "+abbr);
        char c0 = abbr.charAt(0);
        char c1 = abbr.charAt(1);
        char c2 = abbr.charAt(2);
        
        if(c0=='J'){
        if(c1=='A'){
        if(c2=='N'){
        System.out.println("First month");}
        }
        else if(c1=='U'){
        if(c2=='N'){
        
        System.out.println("Sixth month");
        }
        else if(c2=='L'){System.out.println("Seventh month");}
        }
        }
        else if(c0=='F'){System.out.println("Second month.");}
        else if(c0=='M'){
        if(c1=='A'){
        if(c2=='R'){System.out.println("Third Month");}
        else if(c2=='Y'){System.out.println("Fifth Month");}
        }
        }
        else if(c0=='A'){
        if(c1=='P'){
        System.out.println("Forth month ");}
        else if(c1=='U'){System.out.println("Eighth month.");}
          }
        
        else if(c0=='S'){System.out.println("Ninth month");}
        else if(c0=='O'){System.out.println("Tenth month");}
        else if(c0=='N'){System.out.println("Eleventh month");}
        else if(c0=='D'){System.out.println("Twelveth month");}

        else{
            System.out.println("That is not the name of a month..");
        }
        
        
        
    }
    
}
