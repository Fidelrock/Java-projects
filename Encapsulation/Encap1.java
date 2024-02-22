
public class Encap1{
    public static void main(String []args){

        //making an object of the public class C previously

        C e =new C();

        e.setempID(6);
        e.setage(33);
        e.setname("Fidel");

        //Now lets print out

        System.out.println("Name "+e.getname());
        System.out.println("Age "+e.getage());
        System.out.println("ID "+e.getempID());

    }
}