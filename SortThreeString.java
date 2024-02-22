import java.util.Scanner;

class SortThreeString{
public static void main(String[]args){
    Scanner input = new Scanner(System.in);

    System.out.println("Enter three names, one per line: ");
    String s1 = input.nextLine();
    String s2 = input.nextLine();
    String s3 = input.nextLine();

    if(s1.compareTo(s2)<=0&&s2.compareTo(s3)<=0){
        System.out.println(s1+ ", "+s2+", "+s3);
    }
    if(s1.compareTo(s3)<=0&&s3.compareTo(s2)<=0){
        System.out.println(s1+ ", "+s3+", "+s2);
    }
    if(s2.compareTo(s1)<=0&&s1.compareTo(s3)<=0){
        System.out.println(s2+ ", "+s1+", "+s3);
    }
    if(s2.compareTo(s3)<=0&&s3.compareTo(s1)<=0){
        System.out.println(s2+ ", "+s3+", "+s1);
    }
    if(s3.compareTo(s1)<=0&&s1.compareTo(s2)<=0){
        System.out.println(s3+ ", "+s1+", "+s2);
    }
    if(s3.compareTo(s2)<=0&&s2.compareTo(s1)<=0){
        System.out.println(s3+ ", "+s2+", "+s1);
    }
}

}