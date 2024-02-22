public class Main{
    public static double sqrt(double x){
        if(x<0)throw new IllegalArgumentException();
        return Math.sqrt(x);
    }
    public static void main(String[]args){
        try {
            System.out.println(sqrt(25));
        } catch (Exception exception) {
            // TODO: handle exception
            System.out.println("exception: "+exception);
        }
        System.out.println("The exception was Caught.");
        System.out.println("END OF THE MAIN METHOD");
    }
}
