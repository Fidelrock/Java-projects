//Just a roughWork
public class RoughWork{
    public static void main(String[]args){
        int m,n;
        int num =5;
        for(m=1;m<=num;m++){
             for(n=1;n<=(num-m);n++){
               System.out.print(" ");
            }
            System.out.println("\n");

            for(n=1;n<=(m*2-1);n++){
                System.out.print("*");
            }
            System.out.print("\n");
            //System.out.print( "\n");
        
        }
    }
}