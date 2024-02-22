import java.util.Random;

class ChoosingAlternatives{
    public static void main(String[]args){
        Random random = new Random();
        float a = random.nextFloat();
        System.out.println("a= "+a);
        float b = random.nextFloat();
        System.out.println("b= "+b);
        float c = random.nextFloat();
        System.out.println("c= "+c);

        //Selection conditions
        if(a<b){
            if(b<c){
                System.out.println("a<b<c");
            }
            else if(a<c){
                System.out.println("a<c<b");
            }
            else{
                System.out.println("c<a<b");
            }
        }
        else{
            if(a<c){
                System.out.println("b<a<c");
            }
            else if(b<c){
                System.out.println("b<c<a");
            }
            else{
                System.out.println("c<b<a");
            }
        }

    }
}