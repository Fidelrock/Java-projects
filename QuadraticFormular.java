// Using the quadratic formula to find the values of X

import java.util.Scanner;

class QuadraticFormular{
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);

            //The three inputs

        System.out.println("Enter three coefficients: ");
        System.out.println("\ta: ");
        int a = in.nextInt();

        System.out.println("\tb: ");
        int b = in.nextInt();

        System.out.println("\tc: ");
        int c = in.nextInt();

        //The if else statements

        System.out.println("The equation is: ");

        if(a==0){
            if(b==0){

                if(c==0){
                    System.out.println("0=0\nEvery number is a solution");
                }
                else{
                    System.out.println(c+" = 0\nNo number is a solution.");
                }
            }
            else{
                System.out.println(b+" x + "+c+ " = 0\n\tx= "+(float)-c/b);

            }

        }
        else{
            System.out.println(a+"x^2 + "+b +"x + "+c+ " = 0");
            int d = b*b -4*a*c;
            if(d<0){
                System.out.println("No real number is a solution.");

            }
            else if(d==0){
                System.out.println("\tx = "+(float)-b/(2*a));
            }
            else{
                double sd = Math.sqrt(d);
                System.out.println("\tx1 = "+(float)(-b+sd)/(2*a));
                System.out.println("\tx2 = "+(float)(-b-sd)/(2*a));
                
            }
        }

    }
}