//This person class is basically for logins
import java.util.Scanner;
public class Person{
    private String username;
    private String password;
    private String isconfirmPswd;
    private String newPassword;
    String name;
    
    Scanner input = new Scanner(System.in);
 public String getusername(){
    
    return username;
 }
 public void setusername(String username){
    this.username = username;
 }

 public String getpassword(){
    
    return password;
 }
 public void setpassword(String password){
    this.password =password;
 }

 public String getisconfirmPswd(){
    
    return isconfirmPswd;
 }
 public void setisconfirmPswd(String isconfirmPswd){
    this.isconfirmPswd =isconfirmPswd;
 }

 
 public String getnewPassword(){
    
    return newPassword;
 }
 public void setnewPassword(String newPassword){
    this.newPassword = newPassword;
 }
// User Logs In
 public void logIn(){
   

    System.out.println("Enter your Username: ");
    username = input.next();

    System.out.println("Enter your password: ");
    password = input.next();

    System.out.println("Checks if details are available in the database...\n If not available redirects to register or forget password");



 }
 //for goto;
 // Label register ;
 //The user registers
 public void register(){
    
    System.out.println("Enter your full names: ");
    name = input.next();

    System.out.println("Enter your password: ");
    password = input.next();


    System.out.println("Re-enter your password: ");
    isconfirmPswd = input.next();
    password.equals(isconfirmPswd);
    if(password.equals(isconfirmPswd)== true){
        System.out.println("Inserts the details in the database...");
        System.out.println("Account Created successfull...\nNow LogIn");
    }
   else{
    System.out.println("Confirmation Invalid");
   }

 }

 //Label changePswd;
 //User has forgotten password
 public void changePassword(){
    

    System.out.println("Enter your Username: ");
    username = input.next();

    //System.out.println("Enter your old password: ");
    //password = input.next();

    System.out.println("Enter your new password: ");
    newPassword = input.next();

    System.out.println("Re-enter your new password: ");
    isconfirmPswd = input.next();

    newPassword.equals(isconfirmPswd);
    if( newPassword.equals(isconfirmPswd)== true){
        System.out.println("Updates the details in the database...");
        System.out.println("Password Changed successfull...\nNow LogIn");
    }
   else{
  System.out.println("Invalid Confirmation");
   }

 }
 }

