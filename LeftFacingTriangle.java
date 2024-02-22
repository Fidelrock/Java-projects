//Left facing right angled triangle
//A triangle shape
import java.util.Scanner;
public class LeftFacingTriangle{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int startNum,k,i,j;
        int a,b,c;
        int d,e;

        System.out.println("Please Enter a random number:: ");
        startNum= input.nextInt();
        for(i=1;i<=startNum;i++){
            for(j=i;j<=startNum;j++){
                System.out.print(" ");
            }
            for(k=1;k<=i;k++){
                System.out.print("*");
            }
            for(a=1;a<i;a++){
                System.out.print("*");
            }
            for(b=i;b<=startNum;b++){
                System.out.print(" ");
            }
            for(c=i;c<startNum;c++){
                System.out.print(" ");
            }
            for(e=1;e<=i;e++){
                System.out.print("*");
            }
            for(d=1;d<i;d++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
        //System.out.println();
       //The below loop will construct the lower part of the shape
        for(i=1;i<=startNum;i++){
            for(k=1;k<=i;k++){
                System.out.print(" ");
            }
            for(j=i;j<=startNum;j++){
                System.out.print("*");
            }
            for(a=i;a<startNum;a++){
                System.out.print("*");
            }
            for(b=1;b<=i;b++){
                System.out.print(" ");
            }
            for(c=1;c<i;c++){
                System.out.print(" ");
            }
            for(d=i;d<=startNum;d++){
                System.out.print("*");
            }
            for(e=i;e<startNum;e++){
                System.out.print("*");
            }

            System.out.print("\n");
        }

    }
} 