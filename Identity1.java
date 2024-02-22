// Importing scanner function for inputs
import java.util.Scanner;
public class Identity1{
    public static void main(String[]args){
        //Creating an instance of the scanner function
        Scanner in = new Scanner(System.in);
        String Id[]= new String[6];
        int Age,i;
System.out.println("Enter your Name,Nationality,Religion,Career,Marital_Status and Hobby respectively");
for(i=0;i<6;i++){
    Id[i]= in.nextLine();
}
System.out.println("Enter your age");
Age= in.nextInt();
for(i=0;i<6;i++){
    if(i==0){
        System.out.println("Name= "+Id[0]);
    }
    else if(i==1){
        System.out.println("Nationality= "+Id[1]); 
    }
    else if(i==2){
        System.out.println("Religion= "+Id[2]);
    }
    else if(i==3){
        System.out.println("Career= "+Id[3]);
    }
    else if(i==4){
        System.out.println("Marital_Status= "+Id[4]);
    }
    else{
        System.out.println("Hobby= "+Id[5]);
    } 
}
System.out.println("Age= "+Age);
    }
}