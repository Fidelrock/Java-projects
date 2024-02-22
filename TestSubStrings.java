//Sub-strings
class TestSubStrings{
    public static void main(String[]args){
        //Variable declaration

        String alpha = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        System.out.println("alpha "+alpha);

        System.out.println("Alpha.length(): "+alpha.length());

        String sub = alpha.substring(2,7);
        System.out.println("sub = alpha.subString(2,7) = "+sub);

        System.out.println("sub.length(): "+sub.length());
        System.out.println("sub.charAt(3): "+sub.charAt(3) );
        System.out.println("alpha.charAt(3): "+alpha.charAt(3));
        String subStrin = alpha.substring(4);
        System.out.println("subStrin= alpha.subString(4): "+subStrin);
        System.out.println("subStrin.length(): "+subStrin.length());
        System.out.println("subStrin.charAt(4): "+subStrin.charAt(4));
        // Welcome to try String methods
    }
}