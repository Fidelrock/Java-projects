// A program in java for guess game
import java.util.Random;
import java.util.Scanner;

class GuessNumber{
    public static void main(String[]args){
        Random rand = new Random();
        Scanner input = new Scanner(System.in);

        int guess;
        int numberOfTries=3;
        boolean win = false;
        int countOfTries =0;

        //Generating a random number
        int random = rand.nextInt(10);

        System.out.println(random);
        //While loop
        while(win==false&&countOfTries<3){
        System.out.println("Guess a number between 0 to 10: ");
        guess = input.nextInt();
        if(guess ==random && countOfTries<numberOfTries){
            win =true;
        }  
          else{
            countOfTries++;
          }

        }
        if(win==true){
            System.out.println("YOU WON!!!");
        }
        else{
            System.out.println("YOU ARE OUT OF TRIALS!!!");
        }
    }
}
