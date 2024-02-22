import java.util.Random;
class ChoosingAlternative{

    public static void main(String[]args){

        Random random = new Random();

        int m = random.nextInt(100);

        System.out.println("m= "+m);

        int n = random.nextInt(100);

        System.out.println("n= "+n);

        int min = (m<n ? m:n);

        int max = (m>n ? m:n);

        System.out.println("min= "+min);

        System.out.println("max= "+max);
    }
}