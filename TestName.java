class TestName{
    public static void main(String[]args){
        NameComposition tr = new NameComposition();
        NameComposition fc = new NameComposition();
        tr.setfirst("Theodore");
        tr.setlast("Roosevelt");

        fc.setfirst("Francis");
        fc.setmiddle("Harry Compton");
        fc.setlast("Crick");

        System.out.println(fc + " won the 1962 Nobel in Physiology. ");
        System.out.println("His first name was "+fc.getfirst());
        System.out.println(tr + " won the 1906 Nobel Peace Price. ");
        System.out.println("His middle name was "+tr.getmiddle());


    }
}
