//Guessing Birthdays
import java.util.Scanner;
public class GuessingBirthdays{
    public static void main(String[]args){
        //Creating an instance of scanner
         Scanner input = new Scanner(System.in);

        //Initializing variables
        String set_1 = "1 3 5 7 \n" +"9 11 13 15\n"+"17 19 21 23\n"+"26 27 29 30 31\n";
        String set_2 = "2 3 6 7\n"+"10 11 14 15\n"+"18 19 22 23\n"+"28 29 30 31\n";
        String set_3 = "4 5 6 7\n"+"12 13 14 15\n"+"20 21 22 23\n"+"28 29 30 31\n";
        String set_4 = "8 9 10 11\n"+"12 13 14 15\n"+"24 25 26 27\n"+"28 29 30 31\n";
        String set_5 = "16 17 18 19\n"+"20 21 22 23\n"+"24 25 26 27\n"+"28 29 30 31\n";

        int day = 0;
        int answer;

        System.out.println("Is your birthday in set 1? ");
        System.out.print(set_1);
        System.out.println("Enter 0 for No and 1 for Yes.");
        answer = input.nextInt();

        if(answer==1){
            day+=1;
        }

        System.out.println("Is your birthday in set 2? ");
        System.out.print(set_2);
        System.out.println("Enter 0 for No and 1 for Yes.");
        answer = input.nextInt();

        if(answer==1){
            day+=2;
        }
        System.out.println("Is your birthday in set 3? ");
        System.out.print(set_3);
        System.out.println("Enter 0 for No and 1 for Yes.");
        answer = input.nextInt();

        if(answer==1){
            day+=4;
        }
        System.out.println("Is your birthday in set 4? ");
        System.out.print(set_4);
        System.out.println("Enter 0 for No and 1 for Yes.");
        answer = input.nextInt();

        if(answer==1){
            day+=8;
        }
        System.out.println("Is your birthday in set 5? ");
        System.out.print(set_5);
        System.out.println("Enter 0 for No and 1 for Yes.");
        answer = input.nextInt();

        if(answer==1){
            day+=16;
        }

        System.out.println("Your birthday is "+day+" !");
        
    }
}