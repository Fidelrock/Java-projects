
package guessinggame;
import java.util.Random;
import java.util.Scanner;

public class GuessingGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Random rand = new Random();
        int numberToGuess = rand.nextInt(100);
        int numberOfTries = 0;
        
        Scanner input = new Scanner(System.in);
        
        int guess;
        
        boolean win =false;
        
        while(win==false){
            System.out.println("Guess a number between 0 and 100:");
            guess = input.nextInt();
            numberOfTries++;
        if(guess==numberToGuess){
            win = true;
        }
        else if(guess>numberToGuess){
        System.out.println("The guess too high ");
        }
        else
        {
        System.out.println("The guess too low:");
        }
        }
        System.out.println("You Won !!!");
        System.out.println("The number was "+numberToGuess);
        System.out.println("It took you "+numberOfTries+ " tries");
        
        
        
                
    }
    
}
