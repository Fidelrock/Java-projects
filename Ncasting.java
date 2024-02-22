//Narrowing casting
/*The difference between widening casting and narrowing
 * is that in widenning we pass from a small value to a large value
 * whereas in narrowing casting is from large to small introducind a bracket before the variable name
 */
public class Ncasting{
    public static void main(String[]args){
        double myDouble = 9.78d;
        int myInt = (int) myDouble;
        System.out.println(myDouble);
        System.out.println(myInt);
    }
}