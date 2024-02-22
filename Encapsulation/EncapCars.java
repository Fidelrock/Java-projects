public class EncapCars {
    public static void main(String[]args){

        //creating an object of Cars1
        Cars1 c= new Cars1();

        //Declaring the variables by using the set methods
        c.setname("BMW");
        c.setprice("$30000");
        c.settopSpeed("200Kmph");

        //Printing out using the getter methods

        System.out.println("Name: "+c.getname()+"\nPrice: "+c.getprice()+ "\nTop Speed: "+c.gettopSpeed());
    }
    
}
