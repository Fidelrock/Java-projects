public class Encap2 {
    public static void main(String []args){
        //Creating an object of the class Cars

        Cars c= new Cars( "BMW","$30000","200Kmph");

        //Print output
        System.out.println("Name: "+c.getname()+" Price: "+c.getprice()+" Top Speed: "+c.gettopSpeed());
    }
}
