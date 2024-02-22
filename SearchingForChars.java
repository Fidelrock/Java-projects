class SearchingForChars{
    public static void main(String[]args){
        String str = "This is the Mississippi River .";
        System.out.println(str);
        int i = str.indexOf('s');

        System.out.println("The first index of 's' is : "+i);
        i= str.indexOf('s',i+1);

        System.out.println("The next index of 's' is: "+i);
        i = str.indexOf('s',i+1);

        System.out.println("The next index of 's' is at: "+i);

        i = str.lastIndexOf('s');

        System.out.println("The last index of 's' is: "+i);

        System.out.println(str.substring(i));
        
    }
}