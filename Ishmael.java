class Ishmael{
    public static void main(String[]args){
        String s = "Call me Ishmael";
        System.out.println("S = "+s);
        System.out.println("s.length() = "+s.length());
        System.out.println("The first character of the string is = "+s.charAt(0));
        System.out.println("The last character is = "+s.charAt(s.length()-1));
        System.out.println("The first word is = "+s.substring(0,s.indexOf(' ')));
        
    }
}