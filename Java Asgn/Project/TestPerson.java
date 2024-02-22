import java.util.Scanner;
public class TestPerson{
    
    public static void main(String []args){
        Scanner input = new Scanner(System.in);
        Person person = new Person();

        int n;
        System.out.println("\t\t\t1. LogIn\n\t\t\t2. Register\n\t\t\t3. ChangePassword");
        System.out.println("What do you want to do: ");
        n = input.nextInt();
        //Label Choose;
        

        if(n==1){

            person.logIn();
        }
        else if(n==2){

            person.register();
        }
        else if(n==3){

            person.changePassword();
        }
        else{

            System.out.println("Invalid Choice...!!!");
        }

        }
    }
