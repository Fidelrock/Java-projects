import java.util.Scanner;

public class ATMExample{

public static void main(String arg[]){

int balance = 1000000, withdraw, deposit;

Scanner in = new Scanner(System.in);
while(true){
 System.out.println("Automated Teller Machine");

System.out.println("Choose 1 for withdrawal");
System.out.println("Choose 2 for Deposit");
System.out.println("Choose 3 for check balance");

System.out.println("Choose 4 for EXIT");
System.out.print("Choose the operation you want to perform");

int choice = in.nextInt();
switch(choice){

case 1:
	System.out.print("Enter money to be withdrawn: ");

	withdraw = in.nextInt();
	 
	if(balance>=withdraw){
 balance = balance - withdraw;
System.out.println("Please collect your money");

}
else{
System.out.println("Insufficient balance");}
System.out.println("");
break;

case 2:
System.out.print("Enter Money to be deposited");

deposit = in.nextInt();
balance += deposit;

System.out.println("Your money has been successfully deposited");
System.out.println("");
break;
case 3:
System.out.println("Balance: "+balance);
System.out.println("");
break;

case 4:
System.exit(0);
}
}

}
}