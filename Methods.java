public class Methods{
    public static void main(String[]args){
        int num =3;
        float mark = (float) 54.7;
        System.out.println(mark);
        System.out.println(num);

        otherMethod();
        System.out.println("Hello World");

    }
    public static void otherMethod(){
        int num2 = 545;
        method2();
        System.out.println(num2);
    }
    public static void method2(){
        int num= 563;
        System.out.println(num);
    }
}