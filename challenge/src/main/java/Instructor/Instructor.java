package Instructor;
import student.Person;
public class Instructor extends Person{
    private String employeeNumber ;

    // constructors
    public Instructor(){
        super();
        this.employeeNumber = "";
    }
    public Instructor(String firstName, String secondName, String telephone, String email,String employeeNumber){
        super(firstName,secondName,telephone,email);
        this.employeeNumber = employeeNumber ;
    }
    public String cleanEmployeeNumber(){
        if(this.employeeNumber==null) return "";
        return this.employeeNumber.replaceAll("\\s+","");
    }
    public String summaryLine(){
        return String.format("Instructor[employeeNumber=%s, lastName=%s, firstName=%s]",cleanEmployeeNumber(),getSecondName(),getFirstName());
    }
    public String displayName(){
        StringBuilder name = new StringBuilder() ;
        if(this.getFirstName()==null) name.append(" ");
        else name.append(getFirstName());
        name.append(" ");
        if(this.getSecondName()==null) name.append(" ");
        else name.append(this.getSecondName()) ;
        return name.toString() ;
    }
    // getters & setters
    public String getEmployeeNumber(){return this.employeeNumber;}
    public void setEmployeeNumber(String employeeNumber){this.employeeNumber=employeeNumber;}
    // toCard method
    public String toCard(){
        StringBuilder s = new StringBuilder("Instructor\n");
        s.append("Employee # : ").append(cleanEmployeeNumber())
                .append("\n").append("Name : ").append(displayName()).append("\n").append("Email : ").
                append(getEmail()).append("\n").append("Phone : ").append(getPhone());
        return s.toString() ;
    }
}
