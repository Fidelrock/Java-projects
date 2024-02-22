/*
 * If Else-if statement Example
 * This java program show how to use if else-if statement in java
 * 
 */
public class IfElseIfElseExample{
    public static void main(String[]args){
        /*
         * If else-if statement is used to execute multiple of actions based upon
         * multiple conditions
         * Syntax of if else if statements are
         * if(<condition 1>)
         * statement 1
         * else if(<condition 2>)
         * statement 2
         * ..
         * else
         * statement 3
         * 
         * if<condition 1> is true, statement 1 will be executed,else if <condition2>
         * is true statement2 is executed and so on. If no condition is true, then the else
         * statement is executed.
         */
        int i= 10;
        if(i>100)
        {
            System.out.println("i is greater than 100");
        }
        else if(i>50){
            System.out.println("i is greater than 50");
        }
        else{
            System.out.println("i is less than 50");
        }

    }
}