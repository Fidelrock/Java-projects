 import java.util.Scanner;
public class SolidDiamond{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int rows,a,i,j,k;

        //Starter text
        System.out.println("Please Enter a random number:: ");
        rows= input.nextInt();

        for(i=1;i<=rows;i++){
            for(j=i;j<=rows;j++){
                System.out.print(" ");
            }
            for(k=1;k<=i;k++){
                System.out.print("*");
            }
            for(a=1;a<i;a++){
                System.out.print("*");
            }
            System.out.println();
        }
        //The lower part of the shape

        for(i=1;i<=rows;i++){
            for(k=1;k<=i;k++){
                System.out.print(" ");
            }
            for(j=i;j<=rows;j++){
                System.out.print("*");
            }
            for(a=i;a<rows;a++){
                System.out.print("*");
            }
            System.out.println();
    }
}
}