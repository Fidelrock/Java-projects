/* All rights reseved by the author
 * author Charles David 
*/
public class BeerSong { 
/*
 * @param args the command line arguments 
 */
public static void main(String []args){
    int beerNum=99;
    String word="Bottles";

while ( beerNum>0){
    if(beerNum>1){
        System.out.println(beerNum+ " " +word+ " of beer on the wall");
    }
    //beerNum = beerNum-1;
    if(beerNum==1){
        word="Bottle";
        System.out.println(beerNum+ " "+ word+ " of beer on the wall");
        //System.out.println(beerNum+ " " +word+ " beer");
        System.out.println("Take one down. ");
        System.out.println("Pass it around ");
        }
beerNum = beerNum-1;
}
  if(beerNum==0){
        System.out.println("No more bottles of beer on the wall!");
    }

}
}

