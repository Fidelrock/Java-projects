//A voting allowance program
public class VoAccess{
    static void checkAge(int age){

        //If Age is less than 18 years
        if(age<18){
            System.out.print("Access Denied !!! You are not older enough");
        }
        //If Age is greater or equal to 18 years
        else{
            System.out.print("Access granted !!! you are old enough");
        }

    }


    public static void main(String[]args){
        checkAge(20);
    }
}