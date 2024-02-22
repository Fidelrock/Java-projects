//This prgram is an example to create a Right Angled triangle shape
import java.util.Scanner;
public class RightAngledTriangle{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int startNum,i,j;
        System.out.println("Please Enter a random number:: ");
        startNum= input.nextInt();
        for(i=1;i<=startNum;i++){
            for(j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.print("\n");
        }

    }
}