//Gamble game

import java.util.Random;
import java.util.Scanner;

class GambleGame{
    static int rand ;
   static int guessNum;
    static int easyGuessNum;
    //long sumOfMoneyAvailable;
    static int guess;

// guessRandom is a method to guess a random number without bound..
    public static void guessRand(){
        Random random = new Random();
         rand = random.nextInt(1000);
        if(rand==guess){
            System.out.println("You Won!!!");
        }
        else{
            System.out.println("You lost !!!\n You can try again!!!");
        }
    }
// method to guess a random number with a larger bound
public static void guessRandom(){
    Random random = new Random();
    guessNum = random.nextInt(100);
    if(guessNum==guess){
        System.out.println("You Won!!!");
    }
    else{
        System.out.println("You lost !!!\n You can try again!!!");
    }
}
//Easy to guess random number
public static void easyGuess(){
Random random = new Random();
easyGuessNum = random.nextInt(20);
if(easyGuessNum==guess){
    System.out.println("You Won!!!");
}
else{
    System.out.println("You lost !!!\n You can try again!!!");
}

}

//The main method
public static void main(String[]args){
Scanner input = new Scanner(System.in);

//The program enquires of the coins that the player has.
int numberOfCoins;
boolean win = false;

System.out.println("How many coins do you want to use ?");
numberOfCoins = input.nextInt();
int[] gues=new int[numberOfCoins];
// Game playing depending on the number of coins entered...
switch(numberOfCoins){
    case 1:
    System.out.println("Guess a number: ");
    guess = input.nextInt();
    easyGuess();
    break;

    case 2:
    System.out.println("Guess "+numberOfCoins+" numbers:");
    System.out.println();
    for(int i = 0;i<numberOfCoins; i++){
        System.out.println("Enter your number "+(i+1)+" guess");
        gues[i]=input.nextInt();
        System.out.print("\033[H\033[2J");  
    }
    for(int i = 0;i<numberOfCoins; i++){
        if(gues[i]==rand){
            win = true;
        }
        
    }
    if(win ==true){
        System.out.println("You Won!!!\n You can cashOut now!!!..");
    }
    else{
        System.out.println("Your lucky number was: "+rand+"\nYou Lost...!\nPlease try again...!!!");
    }
    break;

    case 3:
    for(int i = 0;i<numberOfCoins; i++){
        System.out.println("Enter your number "+(i+1)+" guess");
        gues[i]=input.nextInt();
        System.out.print("\033[H\033[2J");  
    }
    for(int i = 0;i<numberOfCoins; i++){
        if(gues[i]==guessNum){
            win = true;
        }
        
    }
    if(win ==true){
        System.out.println("You Won!!!\n You can cashOut now!!!..");
    }
    else{
        System.out.println("Your lucky number was: "+guessNum+"\nYou Lost...!\nPlease try again...!!!");
    }
    break;

    case 4:
    for(int i = 0;i<numberOfCoins; i++){
        System.out.println("Enter your number "+(i+1)+" guess");
        gues[i]=input.nextInt();
        System.out.print("\033[H\033[2J");  
    }
    for(int i = 0;i<numberOfCoins; i++){
        if(gues[i]==guessNum){
            win = true;
        }
        
    }
    if(win ==true){
        System.out.println("You Won!!!\n You can cashOut now!!!..");
    }
    else{
        System.out.println("Your lucky number was: "+guessNum+"\nYou Lost...!\nPlease try again...!!!");
    }
    break;

    case 5:
    for(int i = 0;i<numberOfCoins; i++){
        System.out.println("Enter your number "+(i+1)+" guess");
        gues[i]=input.nextInt();
        System.out.print("\033[H\033[2J");  
    }
    for(int i = 0;i<numberOfCoins; i++){
        if(gues[i]==guessNum){
            win = true;
        }
        
    }
    if(win ==true){
        System.out.println("You Won!!!\n You can cashOut now!!!..");
    }
    else{
        System.out.println("Your lucky number was: "+guessNum+"\nYou Lost...!\nPlease try again...!!!");
    }
    break;

    default :
    System.out.println("Guess "+numberOfCoins+" numbers:");
    System.out.println();
    for(int i = 0;i<numberOfCoins; i++){
        System.out.println("Enter your number "+(i+1)+" guess");
        gues[i]=input.nextInt();
        System.out.print("\033[H\033[2J");  
    }
    for(int i = 0;i<numberOfCoins; i++){
        if(gues[i]==rand){
            win = true;
        }
        
    }
    if(win ==true){
        System.out.println("You Won!!!\n You can cashOut now!!!..");
    }
    else{
        System.out.println("Your lucky number was: "+rand+"\nYou Lost...!\nPlease try again...!!!");
    }
        
    break;
}

}
}