//A voting allowance program
public class VotingAccess{
    static void CheckAge(int Age){
        //If Age is less than 18 years
        if(Age<18){
            System.out.print("Access Denied !!! You are not older enough");
        }
        //If Age is greater or equal to 18 years
        else{
            System.out.print("Access granted !!! you are old enough");
        }

    }
    static void main(String[]args){
        CheckAge("20");
    }
}