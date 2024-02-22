import java.util.Random;
class TestLeapYear{
    public static void main(String[]args){
        Random random = new Random();

        float x = random.nextFloat();

        System.out.println("x = "+x);

        int year = Math.round(200*x + 1800);
        System.out.println("The year is "+year);
        if((year%400==0 || year%100 != 0) && year%4 == 0){
    System.out.println("This is a leap year. ");

        }
        else{
            System.out.println("This is not a leap year.");
        }

    }
}