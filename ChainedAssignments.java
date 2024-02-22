class ChainedAssignments{
    public static void main(String[]args){
        int x=0 ,y=0, z=0;

        System.out.println("X= "+x +" Y= "+y + " Z= "+z);
        x = (y=(z=77));
        System.out.println("X= "+x +" Y= "+y + " Z= "+z);
        x=y=z=33;
        System.out.println("X= "+x +" Y= "+y + " Z= "+z);
        x=y+=z=20;
        System.out.println("X= "+x +" Y= "+y + " Z= "+z);
        x += y-=z=10;
        System.out.println("X= "+x +" Y= "+y + " Z= "+z);
        
    }
}