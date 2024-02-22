class NameModified{
    public static void main(String[]args){
        String name = "Fidelis Odhiambo Onyango";
        System.out.println("My Name is = "+name);
        System.out.println("Name.length() = "+name.length());
        System.out.println("The character at index 4 is = "+name.charAt(4));
        System.out.println("The index of g is = "+name.indexOf('g'));
        System.out.println("name.substring(0,7)= "+name.substring(0,7));
        System.out.println("name.substring(7) = "+name.substring(7));
        System.out.println("name.replace('i','e') = "+name.replace('i','o'));
        System.out.println("The whole name to its small letters is = "+name.toLowerCase());
        System.out.println("The name in uppercase is = "+name.toUpperCase());
        System.out.println("My name is still = "+name);
    }
}