public class Main{
    public static void main(String[]args){
        Student student = new Student("John", "Doe", "1990-01-01", "123 Main St.", "Computer Science");
System.out.println(student.getName()); // prints "John Doe"
System.out.println(student.getDateOfBirth()); // prints "1990-01-01"
System.out.println(student.getGrade()); // prints "A"
    }
}