class TestAppinding{
    public static void main(String[]args){

        StringBuffer buf = new StringBuffer(10);

        buf.append("It was ");
        System.out.println("buf = "+buf);
        System.out.println("buf.length(): "+buf.length());
        System.out.println("buf.capacity(): "+buf.capacity());
        buf.append("the best");
        System.out.println("buf= "+buf);
        System.out.println("buf.length()= "+buf.length());
        System.out.println("buf.capacity(): "+buf.capacity());
        buf.append(" of times.");
        System.out.println("buf = "+buf);
        System.out.println("buf.length() = "+buf.length());
        System.out.println("buf.capacity()= "+buf.capacity());
        //end...


    }
}