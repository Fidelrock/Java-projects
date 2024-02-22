import java.util.Scanner;
public class ElementProgramDemo{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the lower limit: ");
        int x = input.nextInt();
        System.out.println("Enter the upper limit: ");
        int y = input.nextInt();
       // ElementsProgram.
       evenNumbers(x,y);
        int[] array = {x,y};
        //ElementsProgram.
        sumAverageLargestSmallest(array);
    }
    public static void evenNumbers(int x,int y){
        int count = 0, sum = 0;
        for(int i = x; i<y; i++){

            if(i%2==0){
                System.out.print(i+ " ");
                count ++;
                sum += i;

            }
            if(count== 7){
                break;
            }
            
        }
        System.out.println();
            System.out.println("Sum = "+sum);
            System.out.println("Average = "+(sum/7));
            int[] array = {x,y};
            sumAverageLargestSmallest(array);
    }
    public static void sumAverageLargestSmallest(int[]array){
        int sum = 0;
        int max = array[0];
        int min = array[0];
        for(int i =0;i<array.length;i++){
            sum += array[i];
            if (array[i]>max){
                max = array[i];
            }
            if(array[i]<min){
                min = array[i];
            }
        }
        System.out.println("Sum = "+sum);
        System.out.println("average = "+(sum/array.length));
        System.out.println("Largest = "+max);
        System.out.println("Smallest = "+min);
    }
}
