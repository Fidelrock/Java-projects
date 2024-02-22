class TestStringClass{
    public static void main(String[]args){
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        System.out.println("This string is: "+alphabet);
        System.out.println("Its length is "+ alphabet.length());
        System.out.println("The character at index 4 is :" +alphabet.charAt(4));
        System.out.println("The index of Z character is: "+alphabet.indexOf('Z'));
        System.out.println("its lowercase is: "+alphabet.toLowerCase());
        System.out.println("The string is still: "+alphabet);
        
    }
}