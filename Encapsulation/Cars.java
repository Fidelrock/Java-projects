public class Cars{
//initializing private variables

    private  String name;
    private String price;
    private String topSpeed;

//Creating a constructor of the class cars
    public cars( String name,String price,String topSpeed){

        this.name = name;
        this.price = price;
        this.topSpeed = topSpeed;

    }
    // Application of the getters and setters methods
    public String getname(){

        return name;
    }
    public void setname(String newname){
        name= newname;
    }

    public String getprice(){
        return price;
    }
    public void setprice(String newprice){
        price = newprice;

    }
    public String gettopSpeed(){
        return topSpeed;
    }

    public void settopSpeed(String newtopSpeed){
        topSpeed = newtopSpeed;

    }
    


}