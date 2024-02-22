
/*
 * Switch statement example
 * This example shows how to use switch statement in a java program.
 * Switc statement is a better replacement of a multiple if else is statements.
 */
public class SwitchStatementExample{
    public static void main(String[]args){
        /*
         * Syntax of switch statement
         * switch(expression){
         * case value:
         *      //statements
         *      break;
         * case value2:
         *      //statements
         *      break;
         * 
         * ...
         * 
         * default:
         *      //statements
         *      break;
         * }
        here, expression must be of type int,short,byte or char.
        values should be constant literal values and cannot be duplicated

        Flow of switch statement is as below.
        Expression value is compared with each case value. If it
        matches,statements following cases would be executed.
        break statement is used to terminate the execution of statements.

        If non of the case matches,statements following default
        would be executed.
        If break statement is not used within case, all cases following
        matching cases would be executed
         */
        for(int i=0;i<=3; i++){
            switch(i){
                case 0:
                System.out.println("i is 0");
                break;
                case 1:
                System.out.println("i is 1");
                break;
                case 2:
                System.out.println("i is 2");
                break;
                default:
                System.out.println("i is greater than 2");
            }
        }

    }
}