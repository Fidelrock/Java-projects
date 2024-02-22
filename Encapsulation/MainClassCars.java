public class MainClassCars{

    public static void main(String[]agrs){
        Cars c = new Cars("BMW","$30000","300Kmhr");

        // Printing out
        System.out.println("Name: "+c.getname());
        System.out.println("Price: "+ c.getprice());
        System.out.println("TopSpeed: "+c.gettopSpeed());
    }
}