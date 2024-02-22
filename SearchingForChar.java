class SearchingForChar{
    public static void main(String[]args){
        String str = "This is the Mississippi River.";
        System.out.println(str);
        int i = str.indexOf('s');
        System.out.println("The first index of 's' is = "+i);
        i = str.indexOf('s',i+1);
        System.out.println("The next index of 's' is = "+i);
        i = str.indexOf('s',i+1);
        System.out.println("The next index of 's' is = "+i);
        i = str.lastIndexOf('s');
        System.out.println("The last index of 's' is = "+i);
        String sub = str.substring(i);
        System.out.println("Sub = "+sub);
        
    }
}