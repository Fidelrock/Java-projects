class TestSetLength{
    public static void main(String[]args){
        StringBuffer buf = new StringBuffer("It is a far,far better things that I do");
        System.out.println("buf = "+buf);
        System.out.println("buf.length()= "+buf.length());
        System.out.println("buf.capacity()= "+buf.capacity());
        
        // Chhanging the length
        buf.setLength(60);
        System.out.println("buf= "+buf);
        System.out.println("buf.length()= "+buf.length());
        System.out.println("buf.capacity()= "+buf.capacity());

        buf.setLength(30);
        System.out.println("buf= "+buf);
        System.out.println("buf.length()= "+buf.length());
        System.out.println("buf.capacity()= "+buf.capacity());

        //Reversing the string object
        buf.reverse();
         System.out.println("buf = "+buf);
         System.out.println("buf.length() = "+buf.length());
         System.out.println("buf,capacity()= "+buf.capacity());
         

    }
}