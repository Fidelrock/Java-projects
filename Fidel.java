
import java.util.ArrayList;
public class Fidel{
    public static boolean linearSearch(ArrayList<Integer>list,int searchItem){
        for(int i=0;i<list.size();i++){
            if(list.get(i)==searchItem){
                return true;
            }
        }
        return false;
    }
    public static void main(String[]args){
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(5);
        list.add(10);
        list.add(15);

        boolean found = linearSearch(list,10);
        System.out.println(found);
        
        found = linearSearch(list,20);

        System.out.println(found);

    }
}