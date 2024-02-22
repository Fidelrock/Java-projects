public class Student extends Person {
    private String regNumber;
    private String address;
    private String programme;
    
    public Student(String firstName, String lastName, String dateOfBirth, String address, String programme) {
        super(firstName, lastName, dateOfBirth);
        this.address = address;
        this.programme = programme;
    }
    public String getGrade(){
        return "A";
    }
    
}