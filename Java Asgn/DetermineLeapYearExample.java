/*
 * Determine if Year is a Leap Year Java Example
 * This Determine if Year is Leap Year Java Example shows how to
 * determine whether the given Year is a Leap Year 
 */

public class DetermineLeapYearExample{

    public static void main(String[]args){

        //Year we want to check
        int Year = 2004;

        //If year is divisible by 4, it is a leap year

        if((Year % 400== 0)||((Year % 4 ==0)&&(Year %100 != 0)))
        {
            System.out.println("Year "+ Year + " is a Leap Year");
        }
        else{
            System.out.println("Year "+Year+ " is not a Leap Year");
        }
        /*
         * Output of the example would be
         * Year 2004 is a leap year
         */
    }
}