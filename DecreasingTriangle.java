//A decreasing triangle shape
import java.util.Scanner;
public class DecreasingTriangle{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int startNum,i,j;
        System.out.println("Please Enter a random number:: ");
        startNum= input.nextInt();
        for(i=1;i<=startNum;i++){
            for(j=i;j<=startNum;j++){
                System.out.print("* ");
            }
            System.out.print("\n");
        }

    }
} 