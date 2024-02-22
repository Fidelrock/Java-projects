class BufReplacing{
    public static void main (String[]args){
        StringBuffer buf = new StringBuffer();
        buf.append("It was the best of times. ");

        System.out.println("buf= "+buf);
        System.out.println("buf.length() : "+buf.length());
        System.out.println("buf.capacity(): "+buf.capacity());

        //Replacing characters at an index
        buf.setCharAt(11,'w');
        System.out.println("buf = "+buf);
        buf.setCharAt(12,'o');
        System.out.println("buf = "+buf);

        //Adding a character
         buf.insert(13,'r');
         System.out.println("buf = "+buf);
    }
}